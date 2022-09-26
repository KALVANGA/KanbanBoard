import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Contact } from 'src/app/contact';
import { ContactService } from 'src/app/contact-service';



@Component({
  selector: 'app-contact',
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent implements OnInit {

  contact = new Contact();
  currentAction = "";
  constructor(private contactService: ContactService, private router: Router, private contactRoute: ActivatedRoute) {
    this.contactRoute.queryParams.subscribe(params => {
      this.currentAction = params['action'];
      if (params['action'] == "edit" || params['action'] == "view") {
      }
    })
  }

  ngOnInit() {
  }

  contactForm = new FormGroup({
    userName: new FormControl("", [Validators.required, Validators.minLength(3), Validators.pattern("[a-zA-Z].*")]),
    email: new FormControl("", [Validators.required, Validators.email]),
    phoneNo: new FormControl("", [Validators.required, Validators.pattern("^((\\+91-?)|0)?[0-9]{10}$")]),
    message: new FormControl("", [Validators.required, Validators.minLength(2)]),

  });

  onSubmit() {
    this.contactService.createContact(this.contact).subscribe((response) => {
      console.log(response);
      alert("Contact message is add successfully");
      this.router.navigateByUrl('/contact');
    });
  }

  get UserName(): FormControl {
    return this.contactForm.get("userName") as FormControl;
  }
  get Email(): FormControl {
    return this.contactForm.get("email") as FormControl;
  }
  get PhoneNo(): FormControl {
    return this.contactForm.get("phoneNo") as FormControl;
  }
  get Message(): FormControl {
    return this.contactForm.get("message") as FormControl;
  }
}

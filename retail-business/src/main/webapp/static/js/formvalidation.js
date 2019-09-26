
$(document).ready(function() {

$('form[id="second_form"]').validate({
  rules: {
    fname: 'required',
    lname: 'required',
    user_email: {
      required: true,
      email: true,
    },
	panNo:'required',
	address:'required',
	phoneNo:'required',
    psword1: {
      required: true,
      minlength: 8,
    },
    psword2: {
      required: true,
      minlength: 5,
      equalTo: "#psword1",
  }
  },
  messages: {
    fname: 'This field is required',
    lname: 'This field is required',
    user_email: 
    			{
    			required:'Enter a valid email',
    			remote:"Email address already in use"
    				},
	panNo:'This field is required',
	address:'This field is required',
	phoneNo:'This field is required',
  psword1: {
      required:'Please choose a password',
      minlength: 'Password must be at least 8 characters long',
      
    },
    psword2: {
      required:'Please choose the password',
      minlength:'Password must be at least 8 characters long',
      equalTo:'Please make sure you entered the same password',
  }
  },
  submitHandler: function(form) {
    form.submit();
  }
});
 
});
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252" />
        <title>The Diary</title>
        <link rel="stylesheet" type="text/css" href="style.css" />
        <style type="text/css">
            .auto-style1 {
                width: 335px;
                _width: 355px;
                clear: both;
                padding: 10px 0 10px 0;
                _padding: 5px 0 5px 0;
                color: #a53d17;
                margin-left: 0px;
            }
        </style>

        <script type="text/javascript">
            function check()
            {
                if(document.profile.name.value=="")
                {
                    alert("Fill your name.");
                    return false;
                }

                if(document.profile.dob.value=="")
                {
                    alert("Enter Date of Birth");
                    return false;
                }


                if(document.profile.mobile.value=="")
                {
                    alert("Enter Mobile Number");
                    return false;
                }

                if(document.profile.sex.selectedIndex<1)
                {
                    alert("Enter gender");
                    return false;
                }
                if(document.profile.at.selectedIndex<1)
                {
                    alert("Enter workplace");
                    return false;
                }

                if (chk.checked == "")
                {
                    alert("You didn't check it! ")
                    return false;
                }
                return true;
            }

        </script>
    </head>
    <body>
        <div id="wrap">

            <div class="header">
                <div class="logo"><a href="#">
                        <img src="images/1d.png" alt="" title="" border="0" height="40" width="100" /></a></div>
                <div id="menu">
                    <ul>
                        <li><a href="home.html">Home</a></li>
                        <li><a href="about.html">About Us</a></li>
                        <li><a href="friends.html">Friends</a></li>
                        <li class="selected"><a href="profile.jsp">My Profile</a></li>
                        <li><a href="photos.html">Photos</a></li>
                        <li><a href="contact.html">Contact</a></li>
                        <li><a href="index.html">Sign Out</a></li>
                    </ul>
                </div>



            </div>


            <div class="center_content">
                <div class="left_content">
                    <div class="title"><span class="title_icon"><img src="images/bullet1.gif" alt="" title="" /></span>Edit
				Profile </div>

                    <div class="feat_prod_box_details">
                        <p class="details">
                            Tell everybody something about you....<br/>
	     Complete your profile and reveal yourself to everyone.
                        </p>


                        <div class="contact_form">
                            <div class="form_subtitle">personal profile changes</div><br/>

                            <form name="register" action="editpro.jsp" method="post" onSubmit="return check();">
                                <div class="auto-style1">
                                    <label class="contact"><strong>Name:</strong></label>
                                    <input type="text" class="contact_input" name="name"/>
                                </div>


                                <div class="form_row">
                                    <label class="contact"><strong>Date of Birth</strong></label>
                                    <input type="text" class="contact_input" name="dob"/>
                                </div>

                                <div class="form_row">
                                    <label class="contact"><strong>Address</strong></label>
                                    <input type="text" class="contact_input" name="add" />
                                </div>

                                <div class="form_row">
                                    <label class="contact"><strong>City:</strong></label>
                                    <input type="text" class="contact_input" name="city"/>
                                </div>



                                <div class="form_row">
                                    <label class="contact"><strong>State:</strong></label>
                                    <input type="text" class="contact_input" name="stat"/>
                                </div>

                                <div class="form_row">
                                    <label class="contact"><strong>Country:</strong></label>
                                    <input type="text" class="contact_input" name="country"/>
                                </div>

                                <div class="form_row">
                                    <label class="contact"><strong>Mobile No.:</strong></label>
                                    <input type="text" class="contact_input" name="mobile"/>
                                </div>




                                <div class="form_row">
                                    <label class="contact"><strong>Sex</strong></label>
                                    <select title="Gender" class="" id="gender" name="sex">
                                        <option SELECTED >- Select Sex -</option>
                                        <option>Male</option>
                                        <option>Female</option></select>
                                </div>

                                <div class="form_row">
                                    <label class="contact"><strong>I am at</strong></label>
                                    <select title="Gender" class="" id="gender" name="at">
                                        <option SELECTED >- Select  -</option>
                                        <option>School</option>
                                        <option>College</option>
                                        <option>Work</option>
                                        <option>Other</option></select>
                                </div>

                                <div class="form_row">
                                    <label class="contact"><strong>Hobbies:</strong></label>
                                    <input type="text" class="contact_input" style="width: 253px; height: 18px" name="hobbies"/>
                                </div>





                                <div class="form_row">
                                    &nbsp;
                                    <div class="terms">
                                        <input type="checkbox" name="terms" />
                                        I agree to the <a href="#">terms &amp; conditions</a>
                                    </div>
                                </div>


                                  <div class="form_row">
                                    <input type="submit" class="register"/>
                                </div>


                            </form>






                        </div>

                    </div>






                    <div class="clear"></div>
                </div><!--end of left content-->

                <div class="right_content">


                    <div class="cart" style="height: 1px">
                        &nbsp;</div>

                    <div class="title"><span class="title_icon"><img src="images/bullet3.gif" alt="" title="" /></span>About
				 The Diary</div>
                    <div class="about">
                        <p>
                            <img src="images/diaryl.png" alt="" title="" class="right" />
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud.
                        </p>

                    </div>

                    <div class="right_box">

                        <div class="title"><span class="title_icon" style="width: 25px"><img src="images/bullet4.gif" alt="" title="" /></span>Videos</div>
                        <div class="new_prod_box">
                            <a href="details.html">product name</a>
                            <div class="new_prod_bg">
                                <span class="new_icon"><img src="images/promo_icon.gif" alt="" title="" /></span>
                                <a href="details.html"><img src="images/thumb1.gif" alt="" title="" class="thumb" border="0" /></a>
                            </div>
                        </div>

                        <div class="new_prod_box">
                            <a href="details.html">product name</a>
                            <div class="new_prod_bg">
                                <span class="new_icon"><img src="images/promo_icon.gif" alt="" title="" /></span>
                                <a href="details.html"><img src="images/thumb2.gif" alt="" title="" class="thumb" border="0" /></a>
                            </div>
                        </div>

                        <div class="new_prod_box">
                            <a href="details.html">product name</a>
                            <div class="new_prod_bg">
                                <span class="new_icon"><img src="images/promo_icon.gif" alt="" title="" /></span>
                                <a href="details.html"><img src="images/thumb3.gif" alt="" title="" class="thumb" border="0" /></a>
                            </div>
                        </div>

                    </div>

                    <div class="right_box">

                        <div class="title"><span class="title_icon"><img src="images/bullet5.gif" alt="" title="" /></span>Articles</div>

                        <ul class="list">
                            <li><a href="#">accesories</a></li>
                            <li><a href="#">books gifts</a></li>
                            <li><a href="#">specials</a></li>
                            <li><a href="#">hollidays gifts</a></li>
                            <li><a href="#">accesories</a></li>
                            <li><a href="#">books gifts</a></li>
                            <li><a href="#">specials</a></li>
                            <li><a href="#">hollidays gifts</a></li>
                            <li><a href="#">accesories</a></li>
                            <li><a href="#">books gifts</a></li>
                            <li><a href="#">specials</a></li>
                        </ul>

                        <div class="title"><span class="title_icon"><img src="images/bullet6.gif" alt="" title="" /></span>Partners</div>

                        <ul class="list">
                            <li><a href="#">accesories</a></li>
                            <li><a href="#">books gifts</a></li>
                            <li><a href="#">specials</a></li>
                            <li><a href="#">hollidays gifts</a></li>
                            <li><a href="#">accesories</a></li>
                            <li><a href="#">books gifts</a></li>
                            <li><a href="#">specials</a></li>
                            <li><a href="#">hollidays gifts</a></li>
                            <li><a href="#">accesories</a></li>
                        </ul>

                    </div>


                </div><!--end of right content-->




                <div class="clear"></div>
            </div><!--end of center content-->


            <div class="footer">
                <div class="left_footer"><img src="images/di.png" alt="" title="" /><br />

	Copyright &copy; 2011. All Rights Reserved.
                </div>
                <div class="right_footer">
                    <a href="#">Home</a>
                    <a href="#">About Us</a>
                    <a href="#">Services</a>
                    <a href="#">Privacy</a>
                    <a href="#">FAQ</a>
                    <a href="#">Contact Us</a>

                </div>


            </div>


        </div>

    </body>
</html>
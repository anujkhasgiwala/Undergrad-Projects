package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_005fprofile_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.apache.jasper.runtime.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.apache.jasper.runtime.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\" />\r\n");
      out.write("        <title>The Diary</title>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\r\n");
      out.write("        <style type=\"text/css\">\r\n");
      out.write("            .auto-style1 {\r\n");
      out.write("                width: 335px;\r\n");
      out.write("                _width: 355px;\r\n");
      out.write("                clear: both;\r\n");
      out.write("                padding: 10px 0 10px 0;\r\n");
      out.write("                _padding: 5px 0 5px 0;\r\n");
      out.write("                color: #a53d17;\r\n");
      out.write("                margin-left: 0px;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("\r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            function check()\r\n");
      out.write("            {\r\n");
      out.write("                if(document.profile.name.value==\"\")\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Fill your name.\");\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                if(document.profile.dob.value==\"\")\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter Date of Birth\");\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                if(document.profile.mobile.value==\"\")\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter Mobile Number\");\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                if(document.profile.sex.selectedIndex<1)\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter gender\");\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                if(document.profile.at.selectedIndex<1)\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"Enter workplace\");\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                if (chk.checked == \"\")\r\n");
      out.write("                {\r\n");
      out.write("                    alert(\"You didn't check it! \")\r\n");
      out.write("                    return false;\r\n");
      out.write("                }\r\n");
      out.write("                return true;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <div id=\"wrap\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"header\">\r\n");
      out.write("                <div class=\"logo\"><a href=\"#\">\r\n");
      out.write("                        <img src=\"images/1d.png\" alt=\"\" title=\"\" border=\"0\" height=\"40\" width=\"100\" /></a></div>\r\n");
      out.write("                <div id=\"menu\">\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"home.html\">Home</a></li>\r\n");
      out.write("                        <li><a href=\"about.html\">About Us</a></li>\r\n");
      out.write("                        <li><a href=\"friends.html\">Friends</a></li>\r\n");
      out.write("                        <li class=\"selected\"><a href=\"myaccount.html\">My Profile</a></li>\r\n");
      out.write("                        <li><a href=\"photos.html\">Photos</a></li>\r\n");
      out.write("                        <li><a href=\"contact.html\">Contact</a></li>\r\n");
      out.write("                        <li><a href=\"index.html\">Sign Out</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"center_content\">\r\n");
      out.write("                <div class=\"left_content\">\r\n");
      out.write("                    <div class=\"title\"><span class=\"title_icon\"><img src=\"images/bullet1.gif\" alt=\"\" title=\"\" /></span>Edit\r\n");
      out.write("\t\t\t\tProfile </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"feat_prod_box_details\">\r\n");
      out.write("                        <p class=\"details\">\r\n");
      out.write("                            Tell everybody something about you....<br/>\r\n");
      out.write("\t     Complete your profile and reveal yourself to everyone.\r\n");
      out.write("                        </p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"contact_form\">\r\n");
      out.write("                            <div class=\"form_subtitle\">personal profile changes</div><br/>\r\n");
      out.write("\r\n");
      out.write("                            <form name=\"register\" action=\"editpro.jsp\" method=\"post\" onSubmit=\"return check();\">\r\n");
      out.write("                                <div class=\"auto-style1\">\r\n");
      out.write("                                    <label class=\"contact\"><strong>Name:</strong></label>\r\n");
      out.write("                                    <input type=\"text\" class=\"contact_input\" name=\"name\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form_row\">\r\n");
      out.write("                                    <label class=\"contact\"><strong>Date of Birth</strong></label>\r\n");
      out.write("                                    <input type=\"text\" class=\"contact_input\" name=\"dob\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form_row\">\r\n");
      out.write("                                    <label class=\"contact\"><strong>Address</strong></label>\r\n");
      out.write("                                    <input type=\"text\" class=\"contact_input\" name=\"add\" />\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form_row\">\r\n");
      out.write("                                    <label class=\"contact\"><strong>City:</strong></label>\r\n");
      out.write("                                    <input type=\"text\" class=\"contact_input\" name=\"city\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form_row\">\r\n");
      out.write("                                    <label class=\"contact\"><strong>State:</strong></label>\r\n");
      out.write("                                    <input type=\"text\" class=\"contact_input\" name=\"stat\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form_row\">\r\n");
      out.write("                                    <label class=\"contact\"><strong>Country:</strong></label>\r\n");
      out.write("                                    <input type=\"text\" class=\"contact_input\" name=\"country\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form_row\">\r\n");
      out.write("                                    <label class=\"contact\"><strong>Mobile No.:</strong></label>\r\n");
      out.write("                                    <input type=\"text\" class=\"contact_input\" name=\"mobile\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form_row\">\r\n");
      out.write("                                    <label class=\"contact\"><strong>Sex</strong></label>\r\n");
      out.write("                                    <select title=\"Gender\" class=\"\" id=\"gender\" name=\"sex\">\r\n");
      out.write("                                        <option SELECTED >- Select Sex -</option>\r\n");
      out.write("                                        <option>Male</option>\r\n");
      out.write("                                        <option>Female</option></select>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form_row\">\r\n");
      out.write("                                    <label class=\"contact\"><strong>I am at</strong></label>\r\n");
      out.write("                                    <select title=\"Gender\" class=\"\" id=\"gender\" name=\"at\">\r\n");
      out.write("                                        <option SELECTED >- Select  -</option>\r\n");
      out.write("                                        <option>School</option>\r\n");
      out.write("                                        <option>College</option>\r\n");
      out.write("                                        <option>Work</option>\r\n");
      out.write("                                        <option>Other</option></select>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form_row\">\r\n");
      out.write("                                    <label class=\"contact\"><strong>Hobbies:</strong></label>\r\n");
      out.write("                                    <input type=\"text\" class=\"contact_input\" style=\"width: 253px; height: 18px\" name=\"hobbies\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"form_row\">\r\n");
      out.write("                                    &nbsp;\r\n");
      out.write("                                    <div class=\"terms\">\r\n");
      out.write("                                        <input type=\"checkbox\" name=\"terms\" />\r\n");
      out.write("                                        I agree to the <a href=\"#\">terms &amp; conditions</a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                  <div class=\"form_row\">\r\n");
      out.write("                                    <input type=\"submit\" class=\"register\"/>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"clear\"></div>\r\n");
      out.write("                </div><!--end of left content-->\r\n");
      out.write("\r\n");
      out.write("                <div class=\"right_content\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"cart\" style=\"height: 1px\">\r\n");
      out.write("                        &nbsp;</div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"title\"><span class=\"title_icon\"><img src=\"images/bullet3.gif\" alt=\"\" title=\"\" /></span>About\r\n");
      out.write("\t\t\t\t The Diary</div>\r\n");
      out.write("                    <div class=\"about\">\r\n");
      out.write("                        <p>\r\n");
      out.write("                            <img src=\"images/diaryl.png\" alt=\"\" title=\"\" class=\"right\" />\r\n");
      out.write("                            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud.\r\n");
      out.write("                        </p>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"right_box\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"title\"><span class=\"title_icon\" style=\"width: 25px\"><img src=\"images/bullet4.gif\" alt=\"\" title=\"\" /></span>Videos</div>\r\n");
      out.write("                        <div class=\"new_prod_box\">\r\n");
      out.write("                            <a href=\"details.html\">product name</a>\r\n");
      out.write("                            <div class=\"new_prod_bg\">\r\n");
      out.write("                                <span class=\"new_icon\"><img src=\"images/promo_icon.gif\" alt=\"\" title=\"\" /></span>\r\n");
      out.write("                                <a href=\"details.html\"><img src=\"images/thumb1.gif\" alt=\"\" title=\"\" class=\"thumb\" border=\"0\" /></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"new_prod_box\">\r\n");
      out.write("                            <a href=\"details.html\">product name</a>\r\n");
      out.write("                            <div class=\"new_prod_bg\">\r\n");
      out.write("                                <span class=\"new_icon\"><img src=\"images/promo_icon.gif\" alt=\"\" title=\"\" /></span>\r\n");
      out.write("                                <a href=\"details.html\"><img src=\"images/thumb2.gif\" alt=\"\" title=\"\" class=\"thumb\" border=\"0\" /></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"new_prod_box\">\r\n");
      out.write("                            <a href=\"details.html\">product name</a>\r\n");
      out.write("                            <div class=\"new_prod_bg\">\r\n");
      out.write("                                <span class=\"new_icon\"><img src=\"images/promo_icon.gif\" alt=\"\" title=\"\" /></span>\r\n");
      out.write("                                <a href=\"details.html\"><img src=\"images/thumb3.gif\" alt=\"\" title=\"\" class=\"thumb\" border=\"0\" /></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"right_box\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"title\"><span class=\"title_icon\"><img src=\"images/bullet5.gif\" alt=\"\" title=\"\" /></span>Articles</div>\r\n");
      out.write("\r\n");
      out.write("                        <ul class=\"list\">\r\n");
      out.write("                            <li><a href=\"#\">accesories</a></li>\r\n");
      out.write("                            <li><a href=\"#\">books gifts</a></li>\r\n");
      out.write("                            <li><a href=\"#\">specials</a></li>\r\n");
      out.write("                            <li><a href=\"#\">hollidays gifts</a></li>\r\n");
      out.write("                            <li><a href=\"#\">accesories</a></li>\r\n");
      out.write("                            <li><a href=\"#\">books gifts</a></li>\r\n");
      out.write("                            <li><a href=\"#\">specials</a></li>\r\n");
      out.write("                            <li><a href=\"#\">hollidays gifts</a></li>\r\n");
      out.write("                            <li><a href=\"#\">accesories</a></li>\r\n");
      out.write("                            <li><a href=\"#\">books gifts</a></li>\r\n");
      out.write("                            <li><a href=\"#\">specials</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"title\"><span class=\"title_icon\"><img src=\"images/bullet6.gif\" alt=\"\" title=\"\" /></span>Partners</div>\r\n");
      out.write("\r\n");
      out.write("                        <ul class=\"list\">\r\n");
      out.write("                            <li><a href=\"#\">accesories</a></li>\r\n");
      out.write("                            <li><a href=\"#\">books gifts</a></li>\r\n");
      out.write("                            <li><a href=\"#\">specials</a></li>\r\n");
      out.write("                            <li><a href=\"#\">hollidays gifts</a></li>\r\n");
      out.write("                            <li><a href=\"#\">accesories</a></li>\r\n");
      out.write("                            <li><a href=\"#\">books gifts</a></li>\r\n");
      out.write("                            <li><a href=\"#\">specials</a></li>\r\n");
      out.write("                            <li><a href=\"#\">hollidays gifts</a></li>\r\n");
      out.write("                            <li><a href=\"#\">accesories</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </div><!--end of right content-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <div class=\"clear\"></div>\r\n");
      out.write("            </div><!--end of center content-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <div class=\"footer\">\r\n");
      out.write("                <div class=\"left_footer\"><img src=\"images/di.png\" alt=\"\" title=\"\" /><br />\r\n");
      out.write("\r\n");
      out.write("\tCopyright &copy; 2011. All Rights Reserved.\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"right_footer\">\r\n");
      out.write("                    <a href=\"#\">Home</a>\r\n");
      out.write("                    <a href=\"#\">About Us</a>\r\n");
      out.write("                    <a href=\"#\">Services</a>\r\n");
      out.write("                    <a href=\"#\">Privacy</a>\r\n");
      out.write("                    <a href=\"#\">FAQ</a>\r\n");
      out.write("                    <a href=\"#\">Contact Us</a>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
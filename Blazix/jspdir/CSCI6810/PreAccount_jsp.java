// JSP Page automatically generated by Desiderata Software JSP generator
// Wed Nov 28 03:07:06 EST 2018

import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.lang.*;
import java.util.*;
import Com.Patel.*;;

public class desisoft_jsp_PreAccount_jsp1543392426987 extends desisoft.server.JspBaseClass {

    int _ds_jsp_lnum = -1;
    public void _jspService( HttpServletRequest request, HttpServletResponse response )
                             throws ServletException, IOException
    {
        JspFactory factory = JspFactory.getDefaultFactory();
        PageContext pageContext = factory.getPageContext( this, request, response,
                                    null,
                                    true,
                                    JspWriter.DEFAULT_BUFFER,
                                    true
                                    );

        // implicit variables.
        HttpSession session = pageContext.getSession();
        JspWriter out = pageContext.getOut();
        ServletConfig config = getServletConfig();
        ServletContext application = config.getServletContext();
        Object page = this;
        try {
_ds_jsp_lnum = 1;
            out.println( "<!--" );
_ds_jsp_lnum = 2;
            out.println( "/******************************************************************************" );
_ds_jsp_lnum = 3;
            out.println( "*\tProgram Author: Dhara Patel for CSCI 6810 Java and the Internet       *" );
_ds_jsp_lnum = 4;
            out.println( "*\tDate: November,2018                                                   *" );
_ds_jsp_lnum = 5;
            out.println( "*******************************************************************************/" );
_ds_jsp_lnum = 6;
            out.println( "-->" );
_ds_jsp_lnum = 7;
            out.println();
_ds_jsp_lnum = 8;
            out.println();
_ds_jsp_lnum = 9;
            out.println();
_ds_jsp_lnum = 10;
            out.println();
_ds_jsp_lnum = 11;
            out.println();
_ds_jsp_lnum = 12;
            out.println( "<HTML><HEAD></HEAD>" );
_ds_jsp_lnum = 13;
            out.println( "<Body background=\"account.jpg\">" );
_ds_jsp_lnum = 14;
            out.println( "    <FORM NAME=\"AccountForm\" ACTION=\"/Account\" METHOD =\"POST\">" );
_ds_jsp_lnum = 15;
            out.print( "        <INPUT TYPE=\'hidden\' NAME=\'UserID\' VALUE=\'" );
            out.print( request.getParameter("UserID") );
            out.println( "\'>" );
_ds_jsp_lnum = 16;
            out.println( "      \t<br>" );
_ds_jsp_lnum = 17;
            out.println( "      \t<br>" );
_ds_jsp_lnum = 18;
            out.println( "      \t<br>" );
_ds_jsp_lnum = 19;
            out.println( "        <center>  " );
_ds_jsp_lnum = 20;
            out.println( "        <fieldset style=\"width:450px\">" );
_ds_jsp_lnum = 21;
            out.println( "         <legend align=\"left\"><b><font size =\'6\'color=\"red\">Open Account</font></b></legend><br>" );
_ds_jsp_lnum = 22;
            out.println( "        <TABLE cellPadding=3 ALIGN=\'center\'>" );
_ds_jsp_lnum = 23;
            out.println( "        " );
_ds_jsp_lnum = 24;
            out.println( "        <!--<TR bgcolor=\'#ECFAEB\'>-->" );
_ds_jsp_lnum = 25;
            out.println( "        <TR background=\'account.jpg\'>" );
_ds_jsp_lnum = 26;
            out.println( "\t      <TD><B><font size =\'5\'>Choose Account Type:</font></b></TD>" );
_ds_jsp_lnum = 27;
            out.println( "\t         <TD>" );
_ds_jsp_lnum = 28;
            out.println( "\t            <select size=\"1\" name=\"CheckingOrSavings\">" );
_ds_jsp_lnum = 29;
            out.println( "\t               " );
_ds_jsp_lnum = 30;
            out.println( "\t\t\t <option selected value=\"Checking\">Checking Account</option>" );
_ds_jsp_lnum = 31;
            out.println( "\t\t\t  <option value=\"Savings\">Savings Account</option>  " );
_ds_jsp_lnum = 32;
            out.println( "\t  \t          </select>" );
_ds_jsp_lnum = 33;
            out.println( "\t            </TD>" );
_ds_jsp_lnum = 34;
            out.println( "            </TR>" );
_ds_jsp_lnum = 35;
            out.println( "           <!-- <TR bgcolor=\'#F1F1FD\'>-->" );
_ds_jsp_lnum = 36;
            out.println( "            <TR background=\'account.jpg\'>" );
_ds_jsp_lnum = 37;
            out.println( "\t          <TD><B><font size =\'5\'>Username:</font></B></TD>" );
_ds_jsp_lnum = 38;
            out.println( "\t              <TD>" );
_ds_jsp_lnum = 39;
            out.print( "\t              <INPUT TYPE=\'text\' NAME=\'UsernameField\' Value=\'" );
            out.print( request.getParameter("UserID") );
            out.println( "\' SIZE=\'25\'>" );
_ds_jsp_lnum = 40;
            out.println( "\t              </TD>" );
_ds_jsp_lnum = 41;
            out.println( "            </TR>" );
_ds_jsp_lnum = 42;
            out.println( "            <!-- <TR bgcolor=\'#ECFAEB\'>-->" );
_ds_jsp_lnum = 43;
            out.println( "             <TR background=\'account.jpg\'>" );
_ds_jsp_lnum = 44;
            out.println( "             <TD><B><font size =\'5\'>Customer Name:</font></B></TD>" );
_ds_jsp_lnum = 45;
            out.println( "\t     \t      <TD>" );
_ds_jsp_lnum = 46;
            out.print( "\t     \t      \t<INPUT TYPE=\'text\' NAME=\'CustomerNameField\' Value=\'" );
            out.print( request.getParameter("Name") );
            out.println( "\' SIZE=\'25\' placeholder=\'Enter Customer Name\'>" );
_ds_jsp_lnum = 47;
            out.println( "\t     \t      </TD>" );
_ds_jsp_lnum = 48;
            out.println( "            </TR>" );
_ds_jsp_lnum = 49;
            out.println( "           <!-- <TR bgcolor=\'#F1F1FD\'>-->" );
_ds_jsp_lnum = 50;
            out.println( "           <TR background=\'account.jpg\'>" );
_ds_jsp_lnum = 51;
            out.println( "            <TD><B><font size =\'5\'>Account Number:</font></B></TD>" );
_ds_jsp_lnum = 52;
            out.println( "\t    \t        <TD>" );
_ds_jsp_lnum = 53;
            out.println( "\t    \t        <INPUT TYPE=\'text\' NAME=\'AccountNumberField\' Value=\'\' SIZE=\'25\' placeholder=\'Enter Account Number\'>" );
_ds_jsp_lnum = 54;
            out.println( "\t    \t        </TD>" );
_ds_jsp_lnum = 55;
            out.println( "            </TR>" );
_ds_jsp_lnum = 56;
            out.println( "            <!--<TR bgcolor=\'#ECFAEB\'>-->" );
_ds_jsp_lnum = 57;
            out.println( "            <TR background=\'account.jpg\'>" );
_ds_jsp_lnum = 58;
            out.println( "            <TD><B><font size =\'5\'>Opening Deposit:</font></B></TD>" );
_ds_jsp_lnum = 59;
            out.println( "\t    \t    \t  <TD>" );
_ds_jsp_lnum = 60;
            out.println( "\t    \t    \t   <INPUT TYPE=\'text\' NAME=\'OpeningDepositField\' Value=\'\' SIZE=\'25\' placeholder=\'Enter Opening Deposit\'>" );
_ds_jsp_lnum = 61;
            out.println( "\t    \t    \t  </TD>" );
_ds_jsp_lnum = 62;
            out.println( "            </TR>" );
_ds_jsp_lnum = 63;
            out.println( "            </TABLE><BR>" );
_ds_jsp_lnum = 64;
            out.println( "            " );
_ds_jsp_lnum = 65;
            out.println( "         " );
_ds_jsp_lnum = 66;
            out.println( "\t                <CENTER><INPUT TYPE=\"SUBMIT\" NAME=\'submitBNTN\' VALUE=\'Open\' style=\"font-size:12pt;color:white;background-color:black;border:2px solid #336600;padding:7px\"></CENTER><BR>" );
_ds_jsp_lnum = 67;
            out.println( "\t    \t   </fieldset>" );
_ds_jsp_lnum = 68;
            out.println( "\t    \t     </center>" );
_ds_jsp_lnum = 69;
            out.println( "\t    \t   </FORM>" );
_ds_jsp_lnum = 70;
            out.println( "\t    \t    </BODY>" );
_ds_jsp_lnum = 71;
            out.println( "\t    \t    </HTML>" );
_ds_jsp_lnum = 72;
            out.println( "\t    \t    <SCRIPT LANGUAGE=\'JavaScript\'>" );
_ds_jsp_lnum = 73;
            out.print( "</SCRIPT>" );
        } catch (Exception ex) {
            out.clearBuffer();
            request.setAttribute( "javax.servlet.jsp.jspException", ex );
            request.setAttribute( "desisoft.jsp.lineNumber", new Integer( _ds_jsp_lnum ));
            pageContext.handlePageException(ex);
        } finally {
            factory.releasePageContext(pageContext);
        }
    }


    public String[] _desisoft_jsp_getDependentFiles() { return _desisoft_jsp_dependencyList; }
    public long[] _desisoft_jsp_getModTimes() { return _desisoft_jsp_dependencyModTimes; }

    static String[] _desisoft_jsp_dependencyList = { "PreAccount.jsp" };
    static long [] _desisoft_jsp_dependencyModTimes = { 1543392420016L };

}

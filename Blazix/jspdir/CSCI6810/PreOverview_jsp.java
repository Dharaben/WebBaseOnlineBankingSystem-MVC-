// JSP Page automatically generated by Desiderata Software JSP generator
// Wed Nov 28 23:38:56 EST 2018

import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.lang.*;
import java.util.*;
import Com.Patel.*;;

public class desisoft_jsp_PreOverview_jsp1543466336653 extends desisoft.server.JspBaseClass {

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
            //***** Start Scriptlet, line 12
            
String sav[] = LoginServlet.getSavingAccountNumbers(request.getParameter("UserID"));
String check[] = LoginServlet.getCheckingAccountNumbers(request.getParameter("UserID"));

            //***** End Scriptlet, line 12
_ds_jsp_lnum = 15;
            out.println();
_ds_jsp_lnum = 16;
            out.println();
_ds_jsp_lnum = 17;
            out.println( "<Html>" );
_ds_jsp_lnum = 18;
            out.println( "<head>" );
_ds_jsp_lnum = 19;
            out.println( "<title></title></head>" );
_ds_jsp_lnum = 20;
            out.println( "<Body background=\"acc.jpg\">" );
_ds_jsp_lnum = 21;
            out.println();
_ds_jsp_lnum = 22;
            out.print( "<FORM NAME=\"OverviewPage\" ACTION=\"/CSCI6810/PreOverview.jsp?UserID=" );
            out.print( request.getParameter("UserID") );
            out.print( "&Name=" );
            out.print( request.getParameter("Name") );
            out.println( "\" METHOD =\"POST\">" );
_ds_jsp_lnum = 23;
            out.print( "<INPUT TYPE=\'hidden\' NAME=\'UserID\' VALUE=\'" );
            out.print( request.getParameter("UserID") );
            out.println( "\'>" );
_ds_jsp_lnum = 24;
            out.println( "<br>" );
_ds_jsp_lnum = 25;
            out.println( "<center>" );
_ds_jsp_lnum = 26;
            out.println( "<fieldset style=\"width:470px\">" );
_ds_jsp_lnum = 27;
            out.println( "           " );
_ds_jsp_lnum = 28;
            out.println( "        <legend align=\'left\'><b><font size =\'6\'color=\"red\">Account Overview</font></b></legend><br>" );
_ds_jsp_lnum = 29;
            out.println( "        <fieldset style=\'width:300px\'>" );
_ds_jsp_lnum = 30;
            out.println( "        <legend align=\'left\'><b><font size =\'3\'color=\"blue\">Checking Accounts</font></b></legend>" );
_ds_jsp_lnum = 31;
            out.print( "        " );
            //***** Start Scriptlet, line 31
            
        int i = 0;
        while(i < check.length) {
        	if(check[i] != null) {
			CheckingAccount checkAccs = new CheckingAccount(request.getParameter("UserID"));
			checkAccs.setCANum(check[i]);
			float bal = checkAccs.getBalance();
        		out.println("<label><b>Account Number:</b></label>");
        		out.println("<input name='CheckingAccountNumber' type='CheckNumber' value='"+ check[i] +"'>");
        		out.println("<br><label><b>Current Balance:</label>");
        		out.println("<input name='CheckCurrtBal' type='CheckBal' value='$"+ bal + "'><BR><br>");
        	}
        	i++;
        }
        
            //***** End Scriptlet, line 31
_ds_jsp_lnum = 45;
            out.println();
_ds_jsp_lnum = 46;
            out.println( "       </fieldset>" );
_ds_jsp_lnum = 47;
            out.println( "        " );
_ds_jsp_lnum = 48;
            out.println( "        <fieldset style=\'width:300px\'>" );
_ds_jsp_lnum = 49;
            out.println( "        <legend align=\'left\'><b><font size =\'3\'color=\"blue\">Savings Accounts</font></b></legend>" );
_ds_jsp_lnum = 50;
            out.print( "        " );
            //***** Start Scriptlet, line 50
            
        int j = 0;
        while(j < sav.length) {
        	if(sav[j] != null) {
			SavingsAccount savAccs = new SavingsAccount(request.getParameter("UserID"));
			savAccs.setSANum(sav[j]);
			float bal = savAccs.getBalance();
        		out.println("<label><b>Account Number:</b></label>");
        		out.println("<input name='SavingAccountNumber' type='SavingNumber' value='"+ sav[j] +"'>");
        		out.println("<br><label><b>Current Balance:</label>");
        		out.println("<input name='SavCurrtBal' type='SavBal' value='$"+ bal +"'><BR><br>");
        	}
        	j++;
        }
        
            //***** End Scriptlet, line 50
_ds_jsp_lnum = 64;
            out.println();
_ds_jsp_lnum = 65;
            out.println( "       </fieldset>" );
_ds_jsp_lnum = 66;
            out.println();
_ds_jsp_lnum = 67;
            out.println( "     <INPUT TYPE=\"SUBMIT\" NAME=\'RefreshBNTN\' VALUE=\'Refresh\' style=\"font-size:12pt;color:white;background-color:black;border:2px solid #336600;padding:7px\">&nbsp;&nbsp;" );
_ds_jsp_lnum = 68;
            out.println( "     <INPUT TYPE=\"SUBMIT\" NAME=\'InterestBNTN\' VALUE=\'Show Me Interest\' style=\"font-size:12pt;color:white;background-color:black;border:2px solid #336600;padding:7px\"> " );
_ds_jsp_lnum = 69;
            out.println( "         " );
_ds_jsp_lnum = 70;
            out.println( "    </fieldset>" );
_ds_jsp_lnum = 71;
            out.println( "        </center>" );
_ds_jsp_lnum = 72;
            out.println( "    </form>" );
_ds_jsp_lnum = 73;
            out.println();
_ds_jsp_lnum = 74;
            out.println( "    " );
_ds_jsp_lnum = 75;
            out.println( "    </body>" );
_ds_jsp_lnum = 76;
            out.print( "    </html>" );
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

    static String[] _desisoft_jsp_dependencyList = { "PreOverview.jsp" };
    static long [] _desisoft_jsp_dependencyModTimes = { 1543466334754L };

}
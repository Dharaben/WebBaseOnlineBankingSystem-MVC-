// JSP Page automatically generated by Desiderata Software JSP generator
// Fri Nov 23 12:14:22 EST 2018

import javax.servlet.*;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public class desisoft_jsp_Inquire_jsp1542993262925 extends desisoft.server.JspBaseClass {

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
            out.println( "<HTML><HEAD></HEAD>" );
_ds_jsp_lnum = 8;
            out.println( "<Body background=\"3.jpg\">" );
_ds_jsp_lnum = 9;
            out.println( "    <FORM NAME=\"InquireForm\" ACTION=\"/Inquire\" METHOD =\"POST\">" );
_ds_jsp_lnum = 10;
            out.print( "        <INPUT TYPE=\'hidden\' NAME=\'UserID\' VALUE=\'" );
            out.print( request.getParameter("UserID") );
            out.println( "\'>" );
_ds_jsp_lnum = 11;
            out.println( "\t<h2><center><I><font color=\"Blue\">Inquire Transaction Form</font></I></center><h2>" );
_ds_jsp_lnum = 12;
            out.println( "        <TABLE cellPadding=3 ALIGN=\'center\'>" );
_ds_jsp_lnum = 13;
            out.println();
_ds_jsp_lnum = 14;
            out.println( "           <TR bgcolor=\'#ECFAEB\'>" );
_ds_jsp_lnum = 15;
            out.println( "                <TD><B>Starting Date:</B></TD>" );
_ds_jsp_lnum = 16;
            out.println( "                    <TD>" );
_ds_jsp_lnum = 17;
            out.println( "\t\t        <INPUT TYPE=\'text\' NAME=\'StartDateField\' Value=\'\' SIZE=\'20\' placeholder=\'Enter Starting Date\'>" );
_ds_jsp_lnum = 18;
            out.println( "\t\t    </TD>" );
_ds_jsp_lnum = 19;
            out.println( "            </TR>" );
_ds_jsp_lnum = 20;
            out.println( "            " );
_ds_jsp_lnum = 21;
            out.println( "            <TR bgcolor=\'#F1F1FD\'>" );
_ds_jsp_lnum = 22;
            out.println( "\t          <TD><B>Ending Date:</B></TD>" );
_ds_jsp_lnum = 23;
            out.println( "\t            <TD>" );
_ds_jsp_lnum = 24;
            out.println( "\t    \t       <INPUT TYPE=\'text\' NAME=\'EndDateField\' Value=\'\' SIZE=\'20\' placeholder=\'Enter Ending Date\'>" );
_ds_jsp_lnum = 25;
            out.println( "\t          </TD>" );
_ds_jsp_lnum = 26;
            out.println( "            </TR>" );
_ds_jsp_lnum = 27;
            out.println( "            </TABLE><BR>" );
_ds_jsp_lnum = 28;
            out.println( "            <CENTER><INPUT TYPE=\"SUBMIT\" NAME=\'submitBNTN\' VALUE=\'Search Inquire Transaction\' style=\"font-size:12pt;color:white;background-color:black;border:2px solid #336600;padding:7px\"></CENTER><BR>" );
_ds_jsp_lnum = 29;
            out.println( "\t    </FORM>" );
_ds_jsp_lnum = 30;
            out.println( "\t    </BODY>" );
_ds_jsp_lnum = 31;
            out.println( "\t    </HTML>" );
_ds_jsp_lnum = 32;
            out.println( "\t    <SCRIPT LANGUAGE=\'JavaScript\'>" );
_ds_jsp_lnum = 33;
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

    static String[] _desisoft_jsp_dependencyList = { "Inquire.jsp" };
    static long [] _desisoft_jsp_dependencyModTimes = { 1542949121778L };

}

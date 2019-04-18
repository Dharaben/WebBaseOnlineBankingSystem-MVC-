Blazix 1.2.7
============

Welcome to Blazix Java Server.  The documentation
is available online from the start menu, or by
opening the file C:\Blazix\docs\Index.html

The documentation includes installation notes.

For those familiar with Blazix 1.0: the page
at C:\Blazix\docs\WhatsNew.html contains a brief
list of new features in Blazix 1.1.  IMPORTANT:
To get the new features pre-configured, delete
your web.ini file and re-install.  The installer
will not overwrite existing web.ini files to
avoid losing user changes.  But the new version
of web.ini has many new items in it. 

Completing the installation for development sites
=================================================

If you are a developer, the following changes to
the environment are recommended:

1)  Add C:\Blazix to your PATH
2)  Add C:\Blazix\Blazix.jar to your CLASSPATH

This will give you access to additional tools
and will provide more flexibility in accessing
the standard tools.  (If you modify the CLASSPATH,
you can also edit the Blazix command files and
remove the "-classpath <path>" arguments.)

Those not familiar with modifying the PATH or
CLASSPATH variables, should read the documentation
in the C:\Blazix\docs\WinPaths.html page.

NOTE:  If you already have items in your classpath
that define J2EE elements, you might run into errors
if there are conflicing definitions.  When working
with Blazix, it is recommended that you remove any
other items that might be defining J2EE elements (except
for those needed by Blazix.)

Re-installing
=============
If you have re-installed over an existing installation,
note that the Blazix installer does not modify existing web.ini
or ejb.ini files.  Therefore if you want to change any port
numbers etc, specifying them during installation will not
be sufficient, they must be modified manually.  If you
are continuing an evaluation, and the new installation gives
you an "expired" message, delete your license.dat file
and re-install.

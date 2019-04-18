C:\Blazix\ejbdir folder: The EJB Jar files folder
====

The default installation procedure configures this
folder for EJB Jar files.

Any EJB Jar files placed in this folder will be automatically
deployed during EJB server startup.  Entity beans
also need a data source -- therefore Entity EJBs placed
here should either already be configured in the ejb.ini, or
they should use the default data source configured
in the ejb.ini file.

This folder is also used from remote EJB deployment
or re-deployment.  Any files uploaded remotely will
be placed here.  Files uploaded remotely are not
immediately deployed.  Instead, they are deployed in
a "rescan" phase.  In a typical "upload and deploy" operation,
in the first pass the server administration tool will
upload the EJB Jar files to all files in the cluster.
In the second pass, all servers will scan for new or
changed EJB's, and load them.

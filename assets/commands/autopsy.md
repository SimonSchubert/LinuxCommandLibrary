# TAGLINE

Web-based digital forensics analysis interface

# TLDR

**Start** Autopsy server

```autopsy```

Start on **specific port**

```autopsy -p [9999]```

Restrict access to **specific host**

```autopsy [localhost]```

Specify **evidence locker** directory

```autopsy -d [path/to/locker]```

# SYNOPSIS

**autopsy** [_-c_] [_-C_] [_-d evid_locker_] [_-i device filesystem mnt_] [_-p port_] [_addr_]

# DESCRIPTION

**autopsy** is a graphical interface for The Sleuth Kit forensic analysis tools. It starts a local web server and provides a browser-based interface for disk analysis, file recovery, and forensic investigation.

The tool allows examiners to analyze file systems, recover deleted files, create timelines, and search for evidence without command-line knowledge.

# PARAMETERS

**-p** _port_
> HTTP server port (default: 9999)

**-c**
> Force cookie inclusion in URL (even for localhost)

**-C**
> Force no cookie in URL

**-d** _dir_
> Specify evidence locker directory (overrides default)

**-i** _device filesystem mnt_
> Enable live analysis mode (specify device, filesystem type, and mount point)

_addr_
> IP address or hostname restricting which client can connect

# FEATURES

- File system analysis
- Deleted file recovery
- Timeline creation
- Keyword searching
- Hash filtering
- Image mounting

# CAVEATS

For authorized forensic investigation only. Web interface requires browser. Legacy version (v2); Autopsy 4 is a standalone Java desktop application. The Sleuth Kit tools must be installed.

# HISTORY

**Autopsy** was created by **Brian Carrier** as a web-based front-end for The Sleuth Kit, first released in **2001**. Version 4 (2015) moved to a Java desktop application.

# SEE ALSO

[sleuthkit](/man/sleuthkit)(1), [foremost](/man/foremost)(1), [bulk_extractor](/man/bulk_extractor)(1)

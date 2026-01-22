# TLDR

**Start** Autopsy server

```autopsy```

Start on **specific port**

```autopsy -p [8080]```

**Open** in browser

```autopsy -b```

# SYNOPSIS

**autopsy** [_-p port_] [_-b_]

# DESCRIPTION

**autopsy** is a graphical interface for The Sleuth Kit forensic analysis tools. It provides a web-based browser interface for disk analysis, file recovery, and forensic investigation.

The tool allows examiners to analyze file systems, recover deleted files, create timelines, and search for evidence without command-line knowledge.

# PARAMETERS

**-p** _port_
> HTTP server port (default: random)

**-b**
> Open browser automatically

# FEATURES

- File system analysis
- Deleted file recovery
- Timeline creation
- Keyword searching
- Hash filtering
- Image mounting

# CAVEATS

For authorized forensic investigation only. Web interface requires browser. Legacy version; Autopsy 4 is a standalone Java application. The Sleuth Kit tools must be installed.

# HISTORY

**Autopsy** was created by Brian Carrier as a web-based front-end for The Sleuth Kit, first released around **2003**. Version 4 (2014) moved to a Java desktop application.

# SEE ALSO

[sleuthkit](/man/sleuthkit)(1), [foremost](/man/foremost)(1), [photorec](/man/photorec)(1)

# TAGLINE

allows viewing multiple log files in a single terminal window

# TLDR

**Follow multiple files**

```multitail [file1.log] [file2.log]```

**Split screen horizontally**

```multitail -s 2 [file1.log] [file2.log]```

**Merge files in one window**

```multitail -I [file1.log] -I [file2.log]```

**Follow with color scheme**

```multitail -cS [apache] [access.log]```

**Execute and follow command**

```multitail -l "[command]"```

**Follow with timestamp**

```multitail -ts [file.log]```

# SYNOPSIS

**multitail** [_options_] [_files_...]

# DESCRIPTION

**multitail** allows viewing multiple log files in a single terminal window. It splits the screen to show different files or merges them with color coding.

The tool provides filtering, searching, and highlighting capabilities for effective log monitoring.

# PARAMETERS

**-s** _n_
> Split in n columns.

**-I** _file_
> Merge file into previous.

**-l** _cmd_
> Execute command and follow.

**-L** _cmd_
> Same as -l but restart on exit.

**-cS** _scheme_
> Color scheme.

**-ts**
> Add timestamp.

**-f**
> Follow mode.

**-i** _file_
> Add file in new window.

**-n** _lines_
> Number of lines per window.

**-m** _lines_
> Scrollback buffer size.

# CAVEATS

Complex layouts take practice. Color schemes need configuration. Many files may clutter display. Resource usage scales with files.

# HISTORY

**multitail** was created by **Folkert van Heusden** to extend tail's functionality to multiple files. It addresses the common need to monitor several log files simultaneously.

# SEE ALSO

[tail](/man/tail)(1), [less](/man/less)(1), [lnav](/man/lnav)(1), [watch](/man/watch)(1)

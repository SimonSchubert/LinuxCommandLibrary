# TLDR

**Extract a crash report** to a directory

```apport-unpack [/var/crash/_usr_bin_app.1000.crash] [output_directory]```

**Extract a crash report** from stdin

```cat [report.crash] | apport-unpack - [output_directory]```

**Extract core dump** for debugging

```apport-unpack [crash_file.crash] [extracted/] && gdb [/usr/bin/app] [extracted/CoreDump]```

# SYNOPSIS

**apport-unpack** _report_ _target-directory_

# PARAMETERS

_report_
> Path to an apport crash report file (.crash), or '-' to read from stdin

_target-directory_
> Directory where extracted files will be written; must be nonexistent or empty

# DESCRIPTION

**apport-unpack** extracts the fields of an Apport problem report into separate files. Each key-value pair in the crash report becomes a separate file, with the key as the filename and the value as the file contents.

Apport crash reports use RFC822 syntax and bundle multiple pieces of information including stack traces, system information, package details, and core dumps. This tool splits them apart for individual examination.

The primary use case is extracting the **CoreDump** file for analysis with **gdb** or other debugging tools. Other extracted files include **ProcMaps**, **ProcStatus**, **Stacktrace**, **Package**, and various system information fields.

Crash reports are typically stored in **/var/crash/** with names following the pattern **_usr_bin_program.uid.crash**.

# CAVEATS

The target directory must be empty or nonexistent; the tool will not overwrite existing files. Only works with valid Apport crash reports; providing raw binary files like core dumps directly will fail. Binary fields like CoreDump may be large.

# HISTORY

**apport-unpack** was developed by **Martin Pitt** as part of the Apport crash reporting system for Ubuntu, introduced in **2006**. The tool addresses the need to extract and analyze individual components from bundled crash reports, particularly the core dump for detailed debugging.

# SEE ALSO

[apport-cli](/man/apport-cli)(1), [gdb](/man/gdb)(1), [apport-retrace](/man/apport-retrace)(1), [coredumpctl](/man/coredumpctl)(1)

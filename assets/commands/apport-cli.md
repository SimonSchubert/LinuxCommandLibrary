# TAGLINE

Command-line interface for crash reporting and bug filing.

# TLDR

**Process pending crash reports** interactively

```apport-cli```

**Report a bug** against a specific package

```apport-cli --file-bug --package [package-name]```

**Report a bug** against a running process

```apport-cli --file-bug --pid [1234]```

**Report a problem** using a symptom script

```apport-cli --file-bug --symptom [audio]```

**Upload an existing crash report** file

```apport-cli --crash-file [/path/to/report.crash]```

**Update an existing bug report** with more information

```apport-cli --update-report [bug-number]```

**Save report to file** instead of submitting

```apport-cli --file-bug --package [package-name] --save [report.apport]```

# SYNOPSIS

**apport-cli** [_options_] [_symptom_|_package_|_pid_|_crash-file_]

# PARAMETERS

**-f**, **--file-bug**
> Report a non-crash problem; prompts for symptom if package/pid not specified

**-p** _package_, **--package=**_package_
> Specify the package to report the problem against

**-P** _pid_, **--pid=**_pid_
> Report a problem against a running process by its PID

**-s** _symptom_, **--symptom=**_symptom_
> Use a symptom script to guide problem reporting (audio, video, network, etc.)

**-c** _report_, **--crash-file=**_report_
> Upload a stored crash report from a file

**-u** _number_, **--update-report=**_number_
> Collect additional information for an existing bug report

**--save** _filename_
> Save the report to a file instead of submitting it

**-w**, **--window**
> Click on an application window to report a bug against it

# DESCRIPTION

**apport-cli** is a command-line interface for Ubuntu's Apport crash reporting system. It processes crash reports collected in **/var/crash/** and allows users to submit them to the bug tracking system with relevant debugging information.

When invoked without arguments, it processes pending crash reports interactively. It can also file new bug reports against packages, running processes, or using symptom scripts that guide users through diagnosing specific problem types.

Apport automatically collects system information, package versions, stack traces, and other debugging data. This comprehensive information helps developers diagnose and fix issues more effectively than manual bug reports.

The tool is primarily intended for server environments where graphical interfaces like **apport-gtk** are unavailable.

# CAVEATS

Apport refuses to create reports if the package or dependencies are outdated; set **APPORT_IGNORE_OBSOLETE_PACKAGES** to override. Submitting reports requires network connectivity and authentication with Ubuntu's bug tracker (Launchpad). Core dumps and logs may contain sensitive information.

# HISTORY

**Apport** was developed by **Martin Pitt** at Canonical and introduced in **Ubuntu 6.10** (Edgy Eft) in **2006**. It was designed to improve bug report quality by automatically collecting relevant debugging information. The system has become a standard component of Ubuntu's quality assurance infrastructure and has been adopted by other Debian-based distributions.

# SEE ALSO

[apport-unpack](/man/apport-unpack)(1), [apport-retrace](/man/apport-retrace)(1), [ubuntu-bug](/man/ubuntu-bug)(1)

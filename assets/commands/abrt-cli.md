# TAGLINE

command-line interface for automatic bug reporting

# TLDR

**List all detected problems**

```abrt-cli list```

**List only unreported problems**

```abrt-cli list -n```

**Show detailed info about a specific problem**

```abrt-cli info [problem_dir]```

**Report a problem to the configured bug tracker**

```abrt-cli report [problem_dir]```

**Remove a crash report**

```abrt-cli remove [problem_dir]```

**Show count of detected problems**

```abrt-cli status```

**Enable or disable auto-reporting**

```abrt-cli auto-report [on|off]```

# SYNOPSIS

**abrt-cli** _command_ [_options_] [_problem_dir_]

# DESCRIPTION

**abrt-cli** is the command-line interface for the Automatic Bug Reporting Tool (ABRT) used on Fedora and RHEL systems. It manages detected application crashes, kernel oopses, and other software defects, allowing users to list, inspect, report, and remove problem data.

Crash information includes identifiers, timestamps, package names, crash reasons, and report status/URLs when applicable.

# PARAMETERS

**list** [**-n**] [**--detailed**] [**--since** _NUM_] [**--until** _NUM_]
> Display detected crashes. **-n** shows only unreported problems. **--detailed** shows full report. **--since**/**--until** filter by timestamp.

**info** [**-d**] [**-s** _SIZE_] _PROBLEM_DIR_
> Show details of a specific problem. **-d** for detailed output. **-s** abridges text larger than SIZE bytes.

**report** [**--delete**] [**--unsafe**] _PROBLEM_DIR_
> Submit a problem for analysis and reporting. **--delete** removes the problem dir after reporting. **--unsafe** ignores security checks.

**remove** _PROBLEM_DIR_
> Delete a problem from the system.

**status** [**-b**] [**--since** _NUM_]
> Show count of detected problems. **-b** prints only the count (bare mode).

**process** [**--since** _NUM_] [**--unsafe**] _PROBLEM_DIR_
> Analyze and report problems in batch.

**auto-report** [**on**|**off**]
> Enable or disable automatic reporting of detected problems.

**-v**, **--verbose**
> Increase verbosity.

**-V**, **--version**
> Show version information.

# CAVEATS

The reporting workflow opens a text editor. Editor selection uses environment variables in order: **$ABRT_EDITOR**, **$VISUAL**, **$EDITOR**, or defaults to **vi**. The ABRT daemon must be running for new problems to be detected.

# HISTORY

Part of **ABRT** (Automatic Bug Reporting Tool), developed by **Red Hat** for Fedora-based systems starting around **2009** as a replacement for bug-buddy.

# SEE ALSO

[abrt](/man/abrt)(1), [abrt-action-analyze-backtrace](/man/abrt-action-analyze-backtrace)(1), [abrt-action-analyze-c](/man/abrt-action-analyze-c)(1), [coredumpctl](/man/coredumpctl)(1), [journalctl](/man/journalctl)(1)

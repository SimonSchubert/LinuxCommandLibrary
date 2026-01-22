# TLDR

**List** detected problems

```abrt-cli list```

Show **details** of a specific problem

```abrt-cli info [problem_id]```

**Remove** a crash report

```abrt-cli remove [problem_id]```

**Report** a problem to the configured bug tracker

```abrt-cli report [problem_id]```

Generate a report for **debugging** manually

```abrt-cli report --analyze [problem_id]```

# SYNOPSIS

**abrt-cli** [_list_] [_info_] [_report_] [_remove_] [_problem_id_]

# DESCRIPTION

**abrt-cli** is the command-line interface for the Automatic Bug Reporting Tool (ABRT) used on Fedora-based systems. It detects, analyzes, and reports application crashes, sending them to bug tracking systems like Bugzilla.

Crash information includes identifiers, timestamps, package names, crash reasons, and report status/URLs when applicable.

# PARAMETERS

**list**
> Display all detected crashes on the machine

**list -d ID_OR_PATH**
> Display detailed report for a specific problem

**info PROBLEM_ID**
> Show details of a specific problem

**report PROBLEM_ID**
> Submit a problem for analysis and reporting

**report -a, --analyze PROBLEM_ID**
> Generate a report for manual debugging

**remove PROBLEM_ID**
> Delete a problem from the system

# CAVEATS

The reporting workflow opens a text editor. Editor selection uses environment variables in order: **$ABRT_EDITOR**, **$VISUAL**, **$EDITOR**, or defaults to **vi**.

# HISTORY

Part of **ABRT** (Automatic Bug Reporting Tool), developed by Red Hat for Fedora-based systems starting around **2009** as a replacement for bug-buddy.

# SEE ALSO

[abrt-action-analyze-backtrace](/man/abrt-action-analyze-backtrace)(1), [abrt-action-analyze-c](/man/abrt-action-analyze-c)(1), [journalctl](/man/journalctl)(1)

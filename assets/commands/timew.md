# TAGLINE

Tag-based time interval tracking

# TLDR

**Start tracking**

```timew start [tag1] [tag2]```

**Stop tracking**

```timew stop```

**Show current**

```timew```

**Show summary**

```timew summary```

**Show week**

```timew summary :week```

**Continue last task**

```timew continue```

**Track past time**

```timew track [9:00] - [12:00] [meeting]```

# SYNOPSIS

**timew** [_command_] [_options_] [_args_]

# PARAMETERS

**start**
> Begin tracking.

**stop**
> End tracking.

**summary**
> Show report.

**continue**
> Resume last.

**track**
> Add past time.

**:day**
> Today filter.

**:week**
> This week.

# DESCRIPTION

**timew** (Timewarrior) is a command-line time tracking tool that records work intervals with flexible tag-based categorization. You start tracking with **start** and one or more tags describing the activity, then **stop** when finished. The **track** command allows logging past intervals retroactively.

Reporting is built in, with the **summary** command providing time breakdowns filterable by date ranges using hint syntax like **:day**, **:week**, or **:month**. Data can also be exported for use with external reporting tools.

Timewarrior integrates with Taskwarrior to automatically track time when tasks are started and stopped, providing a combined task and time management workflow.

# CONFIGURATION

**~/.timewarrior/timewarrior.cfg**
> Main configuration file for themes, exclusions (holidays, weekends), and report settings.

**~/.timewarrior/data/**
> Directory containing time tracking interval data files.

# CAVEATS

Learning curve for ranges. Data in ~/.timewarrior. Taskwarrior optional.

# HISTORY

**Timewarrior** was created by the **Taskwarrior** team as a companion time tracking tool.

# SEE ALSO

[task](/man/task)(1), [timetrap](/man/timetrap)(1), [watson](/man/watson)(1)

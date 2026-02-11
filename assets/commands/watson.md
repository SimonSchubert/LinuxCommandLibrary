# TAGLINE

Command-line time tracking tool

# TLDR

**Start tracking**

```watson start [project] +[tag]```

**Stop tracking**

```watson stop```

**Show current status**

```watson status```

**List today's entries**

```watson log -d```

**List this week**

```watson log -w```

**Show report**

```watson report```

**Edit last entry**

```watson edit```

**Cancel current tracking**

```watson cancel```

# SYNOPSIS

**watson** _command_ [_options_] [_args_]

# PARAMETERS

**start** _PROJECT_ [_+TAGS_]
> Start tracking.

**stop**
> Stop tracking.

**status**
> Current frame.

**log** [_-d_|_-w_|_-m_]
> Show entries.

**report** [_-d_|_-w_|_-m_]
> Generate report.

**edit**
> Edit entry.

**cancel**
> Cancel current.

**add**
> Add past entry.

**remove**
> Delete entry.

# DESCRIPTION

**watson** is a command-line time tracking tool that records work sessions on named projects with optional tags for categorization. Starting a timer associates the current time with a project and tags, and stopping it saves a completed time frame with the calculated duration.

The log command displays tracked entries chronologically, with filters for viewing today's work, the current week, or a specific date range. Reports aggregate time by project, showing total hours spent on each project and its tags over a given period.

Past entries can be added retroactively, existing entries can be edited to correct mistakes, and the cancel command discards the currently running timer without saving it.

# CAVEATS

Single-user tool. No sync built-in. SQLite backend.

# HISTORY

**Watson** was created for simple CLI time tracking. Named after Sherlock Holmes' companion, it helps track where time goes.

# SEE ALSO

[timew](/man/timew)(1), [clockify](/man/clockify)(1)

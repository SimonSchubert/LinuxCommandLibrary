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

**watson** tracks time from the command line. It logs work on projects with tags.

Starting records project and time. Tags categorize work.

Stopping saves the frame. Duration calculated.

Log shows chronological entries. Filter by day, week, month.

Reports aggregate by project. Time totals summarized.

Edit modifies entries. Fix mistakes or add details.

# CAVEATS

Single-user tool. No sync built-in. SQLite backend.

# HISTORY

**Watson** was created for simple CLI time tracking. Named after Sherlock Holmes' companion, it helps track where time goes.

# SEE ALSO

[timew](/man/timew)(1), [clockify](/man/clockify)(1)

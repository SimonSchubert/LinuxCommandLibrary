# TAGLINE

Calendar and reminder system

# TLDR

**Show reminders**

```remind [~/.reminders]```

**Show calendar**

```remind -c [~/.reminders]```

**Show next N days**

```remind -c+[7] [~/.reminders]```

**Run daemon**

```remind -z [~/.reminders]```

**Simple calendar**

```remind -s [~/.reminders]```

# SYNOPSIS

**remind** [_options_] _filename_ [_date_]

# PARAMETERS

**-c** [_+n_]
> Calendar mode (n days ahead).

**-s**
> Simple calendar.

**-z**
> Daemon mode.

**-q**
> Quiet mode.

**-n**
> Next occurrence only.

**@** _time_
> Trigger at time.

# DESCRIPTION

**Remind** is a sophisticated calendar and reminder program. It uses a scripting language for complex recurring events, with support for calendar output and daemon mode.

# REMINDER FILE

```
# ~/.reminders

# Simple reminder
REM Jan 1 MSG Happy New Year!

# Weekly
REM Mon MSG Weekly meeting

# With time
REM Mon AT 9:00 MSG Standup

# Monthly
REM 15 MSG Pay rent

# Advance warning
REM Apr 15 +7 MSG Tax deadline approaching
```

# EXAMPLES

```bash
# Show today's reminders
remind ~/.reminders

# Calendar view
remind -c ~/.reminders

# Next 30 days
remind -c+30 ~/.reminders

# Run in background
remind -z ~/.reminders &

# HTML calendar
remind -pp ~/.reminders | rem2html > cal.html
```

# CONFIGURATION

**~/.reminders**
> Default reminder file containing REM statements that define events, recurring schedules, and timed alerts using Remind's scripting language.

# CAVEATS

Powerful scripting language has learning curve. Configuration via reminder file. Works with wyrd for TUI.

# HISTORY

Remind was written by **David F. Skoll** starting in 1990 as a flexible calendar/reminder system.

# SEE ALSO

[wyrd](/man/wyrd)(1), [calcurse](/man/calcurse)(1), [cal](/man/cal)(1)

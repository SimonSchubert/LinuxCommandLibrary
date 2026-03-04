# TAGLINE

TUI calendar and task manager

# TLDR

**Launch** the calendar TUI

```calcure```

**Start** on a specific date

```calcure --date [2024-01-15]```

**Import** events from an iCal file

```calcure --import [path/to/file.ics]```

# SYNOPSIS

**calcure** [_options_]

# PARAMETERS

**--date** _DATE_
> Start on a specific date (YYYY-MM-DD).

**--import** _FILE_
> Import events from an iCal (.ics) file.

**--config** _FILE_
> Use a custom configuration file.

**-p**, **--privacy**
> Launch in privacy mode (hide event details).

# DESCRIPTION

**calcure** is a terminal-based calendar and task manager with a modern TUI. It displays a monthly calendar view alongside task lists, supporting event creation, recurring events, and task management with priorities and deadlines.

The interface provides vim-like keybindings for navigation and supports color-coded categories, multiple calendars, and iCal import/export. Events and tasks are stored locally and can be synced through iCal-compatible services.

# CONFIGURATION

Configuration is stored in **~/.config/calcure/config.ini**. Options include color themes, keybindings, default views, calendar data paths, and privacy settings. The data directory defaults to **~/.config/calcure/**.

# CAVEATS

Does not provide built-in calendar sync — external tools are needed for CalDAV or Google Calendar integration. Recurring event support may not cover all iCal recurrence rules.

# HISTORY

**calcure** was created as a modern, visually appealing alternative to terminal calendar tools like **calcurse**. Written in **Python**, it focuses on a clean user interface with minimal dependencies.

# SEE ALSO

[calcurse](/man/calcurse)(1), [cal](/man/cal)(1), [taskwarrior](/man/taskwarrior)(1)

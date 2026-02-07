# TAGLINE

Display reminders from a calendar file

# TLDR

**Display today and tomorrow's reminders**

```calendar```

**Show reminders for the next N days**

```calendar -A [7]```

**Look back N days** for reminders

```calendar -B [3]```

**Use a specific calendar file**

```calendar -f [path/to/calendar]```

**Show all upcoming events** (no date limit)

```calendar -a```

**Display reminders for everyone** on the system

```calendar -a```

**Use a specific calendar directory**

```calendar -d [path/to/calendar_dir]```

# SYNOPSIS

**calendar** [_-A days_] [_-B days_] [_-a_] [_-f calendarfile_] [_-d calendardir_]

# PARAMETERS

**-A** _days_
> Look ahead the specified number of days (default: 1, showing today and tomorrow).

**-B** _days_
> Look back the specified number of days.

**-a**
> Process calendar files for all users, sending mail (root only).

**-f** _file_
> Use the specified file instead of ~/.calendar/calendar.

**-d** _dir_
> Use the specified directory for calendar files.

**-t** _date_
> Pretend today is the specified date (format: [[[cc]yy]mm]dd).

**-w**
> Print day of the week name.

# DESCRIPTION

**calendar** is a traditional Unix utility that displays reminders from a calendar file. It reads entries from **~/.calendar/calendar** (or a specified file) and displays those matching today's date and optionally upcoming dates.

Calendar files contain one reminder per line in a simple format: a date followed by a tab and the reminder text. Dates can be specified in various formats including "Jan 1", "1/1", "*/15" (monthly), and day names. The program understands holidays and special date expressions.

The tool was traditionally used for system-wide announcements and personal reminders. When run with **-a** by root, it processes all users' calendar files and sends email notifications. Many systems include pre-installed calendar files with historical dates, holidays, and astronomical events.

Common calendar file locations include system calendars in **/usr/share/calendar/** with files for holidays, history, music, and other categories. Users can include these system files in their personal calendars using **#include** directives.

# CAVEATS

Date formats vary between BSD and other implementations. The -a flag (mail to all users) requires root privileges. Some implementations have limited date parsing capabilities. Email functionality depends on a working mail system.

# HISTORY

The **calendar** command originated in early Unix systems at Bell Labs in the 1970s. It was one of the original time-based utilities, predating cron for simple reminder functionality. The program has been included in BSD systems since the early days and remains part of many Unix-like operating systems, though its usage has declined with modern calendar applications.

# SEE ALSO

[cal](/man/cal)(1), [date](/man/date)(1), [at](/man/at)(1), [cron](/man/cron)(8), [remind](/man/remind)(1)

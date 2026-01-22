# TLDR

**Show** current date and time

```date```

**Custom** format

```date ["+%Y-%m-%d %H:%M:%S"]```

**Show** date in UTC

```date -u```

**Set** date (requires root)

```sudo date -s ["2024-01-15 10:30:00"]```

**Show** date from timestamp

```date -d [@1234567890]```

# SYNOPSIS

**date** [_options_] [_+format_]

# DESCRIPTION

**date** displays or sets the system date and time. It supports various output formats, time calculations, and conversions. The command is essential for timestamping, logging, and time-based operations.

The tool is one of the most commonly used Unix utilities.

# PARAMETERS

**-d**, **--date=**_string_
> Display specified date/time

**-s**, **--set=**_string_
> Set system date/time (requires root)

**-u**, **--utc**
> Print/set UTC time

**-r**, **--reference=**_file_
> Display file's modification time

**-I**[_timespec_]
> ISO 8601 format

**-R**, **--rfc-email**
> RFC 5322 format

# FORMAT SPECIFIERS

**Date:**
- **%Y** - Year (2024)
- **%y** - Year (24)
- **%m** - Month (01-12)
- **%d** - Day (01-31)
- **%B** - Month name (January)
- **%b** - Short month (Jan)
- **%A** - Weekday (Monday)
- **%a** - Short weekday (Mon)

**Time:**
- **%H** - Hour 24h (00-23)
- **%I** - Hour 12h (01-12)
- **%M** - Minute (00-59)
- **%S** - Second (00-59)
- **%p** - AM/PM
- **%Z** - Timezone name

**Combined:**
- **%s** - Unix epoch seconds
- **%F** - Full date (YYYY-MM-DD)
- **%T** - Full time (HH:MM:SS)
- **%c** - Locale's date and time

# WORKFLOW

```bash
# Current date/time
date

# ISO 8601 format
date -I
date "+%Y-%m-%d"

# Custom format
date "+%Y-%m-%d %H:%M:%S"

# Unix timestamp
date +%s

# From timestamp
date -d @1234567890

# Relative dates
date -d "tomorrow"
date -d "next monday"
date -d "2 days ago"
date -d "+3 hours"

# UTC time
date -u

# File modification time
date -r file.txt

# RFC format
date -R
```

# RELATIVE DATES

```bash
date -d "1 day ago"
date -d "2 weeks ago"
date -d "next friday"
date -d "last month"
date -d "3 years ago"
date -d "+5 days"
```

# COMMON USES

**Timestamped filenames:**
```bash
backup-$(date +%Y%m%d).tar.gz
log-$(date +%Y-%m-%d_%H-%M-%S).txt
```

**Logging:**
```bash
echo "$(date): Starting backup" >> log.txt
```

**Conditionals:**
```bash
if [ $(date +%u) -eq 1 ]; then
    echo "It's Monday"
fi
```

# CAVEATS

Setting date requires root. System clock vs hardware clock different. Timezone affects output. Leap seconds not always handled. Different behavior on BSD vs GNU. Relative dates parsing can be ambiguous.

# HISTORY

**date** has been part of Unix since Version 1 in **1971**, one of the original Unix commands.

# SEE ALSO

[timedatectl](/man/timedatectl)(1), [hwclock](/man/hwclock)(8), [cal](/man/cal)(1)

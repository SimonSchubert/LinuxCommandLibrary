# TAGLINE

Extract MIME attachments from email messages

# TLDR

Extract attachments to **current directory**

```ripmime -i path/to/file```

Extract attachments to **specific directory**

```ripmime -i path/to/file -d path/to/directory```

Extract with **verbose output**

```ripmime -i path/to/file -v```

Get **debug information** about decoding

```ripmime -i path/to/file --debug```

# SYNOPSIS

**ripmime** [_options_] -i _file_

# PARAMETERS

**-i** _file_
> Input MIME encoded file

**-d** _directory_
> Output directory for extracted attachments

**-v**
> Enable verbose output

**--debug**
> Show detailed decoding information

# DESCRIPTION

**ripmime** extracts attachments from MIME encoded email packages. It parses email files and saves embedded attachments to disk.

The tool handles various MIME encoding types and can process emails with multiple attachments or nested structures.

# CAVEATS

Be cautious when extracting attachments from untrusted emails as they may contain malware. Verify attachment safety before opening.

# HISTORY

Developed for automated email processing and attachment extraction. Commonly used in email filtering and archiving systems.

# SEE ALSO

[munpack](/man/munpack)(1), [mpack](/man/mpack)(1)

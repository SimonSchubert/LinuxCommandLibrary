# TAGLINE

Plain-text file format and CLI for time tracking

# TLDR

**Start** a stopwatch entry for today

```klog start```

**Stop** the open range

```klog stop```

**Show today** summary

```klog today```

**Print** records from a file

```klog print [times.klg]```

**Create** a new day record

```klog create```

**Track** a finished duration entry

```klog track [1h30m]```

**Report** totals by period

```klog report```

**Total** time in files

```klog total [*.klg]```

**List tags**

```klog tags```

# SYNOPSIS

**klog** *command* [*options*] [*files*...]

# DESCRIPTION

**klog** is both a plain-text time-tracking file format and a command-line tool to create, edit, and analyse those files. Records live in editable text (typically **.klg**), so they work with git, backups, and any editor.

Common workflow: **start** / **stop** for open time ranges, **track** for completed durations, **today** / **print** / **report** / **total** for summaries, and **edit** / **create** for manual changes. Bookmarks and config help point at default files.

Install from https://klog.jotaen.net (prebuilt binaries and packages). The CLI is MIT-licensed; the file format specification is public domain (CC0/OWFa). Tool and format version numbers are independent.

# PARAMETERS

**start** / **stop** / **pause** / **switch**

> Control an open range (stopwatch-style tracking).

**today**

> Show or work with the current day record.

**track** [*duration*]

> Add a completed time entry.

**print** / **report** / **total**

> Display and aggregate time from klog files.

**create** / **edit** / **goto**

> Create or open records for editing.

**tags** / **bookmarks** / **config** / **info** / **json** / **version**

> Metadata, configuration, machine-readable output, and version.

See **klog** *command* **--help** and https://klog.jotaen.net for the full flag set and file format.

# CAVEATS

Learn the record syntax (date headers, ranges, tags) from the official docs before bulk edits. Filtering and multi-file behaviour depend on your version; check **--help**.

# SEE ALSO

[timew](/man/timew)(1), [watson](/man/watson)(1), [ledger](/man/ledger)(1)

# RESOURCES

```[Source code](https://github.com/jotaen/klog)```

```[Homepage](https://klog.jotaen.net)```

```[Documentation](https://klog.jotaen.net)```

<!-- verified: 2026-07-19 -->

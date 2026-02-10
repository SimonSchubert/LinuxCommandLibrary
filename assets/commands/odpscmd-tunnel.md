# TAGLINE

handles bulk data transfer

# TLDR

**Upload data**

```odpscmd tunnel upload [file] [project.table]```

**Download data**

```odpscmd tunnel download [project.table] [output]```

**Upload to partition**

```odpscmd tunnel upload [file] [table/pt=value]```

**Resume upload**

```odpscmd tunnel resume [session_id]```

# SYNOPSIS

**odpscmd** **tunnel** [_command_] [_options_]

# PARAMETERS

**upload** _FILE_ _TABLE_
> Upload to table.

**download** _TABLE_ _FILE_
> Download from table.

**resume** _ID_
> Resume transfer.

**-fd** _CHAR_
> Field delimiter.

**-rd** _CHAR_
> Record delimiter.

**--help**
> Display help information.

# DESCRIPTION

**odpscmd tunnel** handles bulk data transfer. Uploads and downloads large datasets.

The tool provides high-speed data channel. Part of odpscmd suite.

# CAVEATS

Legacy tool. Resumable transfers supported. Bandwidth limits may apply.

# HISTORY

odpscmd tunnel provides **bulk data transfer** for MaxCompute Console.

# SEE ALSO

[odpscmd](/man/odpscmd)(1), [odps-tunnel](/man/odps-tunnel)(1)


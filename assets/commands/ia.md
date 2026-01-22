# TLDR

**Download item**

```ia download [item-name]```

**Upload file**

```ia upload [item-name] [file]```

**Search items**

```ia search "[query]"```

**Get item metadata**

```ia metadata [item-name]```

**List item files**

```ia list [item-name]```

**Configure credentials**

```ia configure```

# SYNOPSIS

**ia** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Subcommand to execute.

**download**
> Download item files.

**upload**
> Upload to item.

**search**
> Search archive.

**metadata**
> Get metadata.

**list**
> List files.

**configure**
> Set credentials.

**--help**
> Display help information.

# DESCRIPTION

**ia** is the Internet Archive command-line tool. It provides access to downloading, uploading, and searching the archive.org collection.

The tool supports bulk operations and scripting. It can manage metadata and files for archived items.

ia interacts with Internet Archive.

# CAVEATS

Requires archive.org account for uploads. Rate limits apply. Large files may take time.

# HISTORY

ia was created by the **Internet Archive** to provide command-line access to their digital library.

# SEE ALSO

[wget](/man/wget)(1), [curl](/man/curl)(1), [youtube-dl](/man/youtube-dl)(1)

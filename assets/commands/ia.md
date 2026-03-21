# TAGLINE

Internet Archive command-line tool

# TLDR

**Download all files** from an item

```ia download [item-name]```

**Download a specific file** from an item

```ia download [item-name] --glob="[*.pdf]"```

**Upload a file** to an item

```ia upload [item-name] [file]```

**Search items** in the archive

```ia search "[query]"```

**Get item metadata** in JSON format

```ia metadata [item-name]```

**List files** in an item

```ia list [item-name]```

**Delete a file** from an item

```ia delete [item-name] [file]```

**Configure** Internet Archive credentials

```ia configure```

# SYNOPSIS

**ia** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Subcommand to execute.

**download**
> Download files from an item.

**upload**
> Upload files to an item.

**delete**
> Delete files from an item.

**search**
> Search the Internet Archive catalog.

**metadata**
> Retrieve or modify item metadata.

**list**
> List files in an item.

**configure**
> Configure Internet Archive credentials.

**tasks**
> Retrieve information about catalog tasks.

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**ia** is the official Internet Archive command-line tool, provided via the **internetarchive** Python package. It provides access to downloading, uploading, searching, and managing items in the archive.org collection.

The tool supports bulk operations and scripting, making it suitable for archivists and researchers working with large datasets. It can manage metadata, upload and delete files, and query the catalog task queue. Authentication is handled via S3-like API keys obtained from archive.org.

# CAVEATS

Requires an archive.org account and API keys for uploads and modifications. Rate limits apply to bulk operations. Large file transfers may take considerable time. Install via **pip install internetarchive**.

# HISTORY

ia was created by the **Internet Archive** to provide command-line access to their digital library.

# SEE ALSO

[wget](/man/wget)(1), [curl](/man/curl)(1), [youtube-dl](/man/youtube-dl)(1), [rclone](/man/rclone)(1)

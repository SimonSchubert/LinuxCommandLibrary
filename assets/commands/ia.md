# TAGLINE

Internet Archive command-line tool

# TLDR

**Download all files** from an item

```ia download [item-name]```

**Download files matching a glob**

```ia download [item-name] --glob="[*.pdf]"```

**Download only files of a specific format**

```ia download [item-name] --format="[512Kb MPEG4]"```

**Download every item** in a collection

```ia download --search "collection:[name]"```

**Upload a file** with metadata

```ia upload [item-name] [file] --metadata="mediatype:[texts]" --metadata="title:[My Title]"```

**Search items** in the archive and print identifiers only

```ia search "[query]" --itemlist```

**Get item metadata** in JSON format

```ia metadata [item-name]```

**Modify a metadata field**

```ia metadata [item-name] --modify="[title:New Title]"```

**List files** in an item

```ia list [item-name]```

**Delete a file** from an item

```ia delete [item-name] [file]```

**Configure** Internet Archive credentials

```ia configure```

# SYNOPSIS

**ia** [_global-options_] _command_ [_options_]

# PARAMETERS

_COMMAND_
> Subcommand to execute. Each has a two-letter alias shown in parentheses below.

**download** (do)
> Download files from an item.

**upload** (up)
> Upload files to an item.

**delete** (rm)
> Delete files from an item.

**copy** (cp)
> Copy files between items.

**move** (mv)
> Move or rename files in items.

**search** (se)
> Search items on archive.org.

**metadata** (md)
> Retrieve or modify item metadata.

**list** (ls)
> List files in an item.

**tasks** (ta)
> Retrieve information about catalog tasks.

**reviews** (re)
> Submit and modify reviews for items.

**flag** (fl)
> Manage flags on items.

**simplelists** (sl)
> Manage simple lists.

**account** (ac)
> Manage an archive.org account (requires admin privileges).

**configure** (co)
> Configure Internet Archive credentials.

**-c**, **--config-file** _FILE_
> Path to the configuration file.

**-l**, **--log**
> Enable logging.

**-d**, **--debug**
> Enable debugging.

**-i**, **--insecure**
> Use plain HTTP instead of HTTPS (sends credentials unencrypted).

**-H**, **--host** _HOST_
> Host to connect to (not used for requests to s3.us.archive.org).

**-h**, **--help**
> Display help information. Use **ia** _command_ **--help** for subcommands.

**-v**, **--version**
> Display version information.

# DESCRIPTION

**ia** is the command-line tool for archive.org, provided by the **internetarchive** Python package. It downloads, uploads, searches and manages items in the archive.org collection.

The tool supports bulk operations through spreadsheets (**--spreadsheet**) and item lists (**--itemlist**), making it suitable for archivists and researchers working with large datasets. Authentication uses S3-like API keys from an archive.org account, stored by **ia configure**.

# CAVEATS

Uploads and modifications require an archive.org account. Without a **mediatype** metadata field, items are uploaded as **data**, which cannot be changed later. Versions up to 5.4.1 contain a directory traversal vulnerability in file downloads, so upgrade to 5.4.2 or later. Upstream only supports pip, pipx, source or its standalone binary; distribution packages are often outdated.

# HISTORY

The **internetarchive** library and its **ia** tool were created by **Jacob M. Johnson** of the Internet Archive and are developed in the open at **jjjake/internetarchive** on GitHub.

# SEE ALSO

[wget](/man/wget)(1), [curl](/man/curl)(1), [youtube-dl](/man/youtube-dl)(1), [rclone](/man/rclone)(1)

# RESOURCES

```[Source code](https://github.com/jjjake/internetarchive)```

```[Documentation](https://archive.org/developers/internetarchive/cli.html)```

<!-- verified: 2026-11-09 -->

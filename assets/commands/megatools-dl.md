# TAGLINE

downloads files and folders from mega

# TLDR

**Download files** from a mega.nz link into the current directory

```megatools-dl [https://mega.nz/...]```

Download files into a **specific directory**

```megatools-dl --path [path/to/directory] [https://mega.nz/...]```

**Interactively choose** which files to download

```megatools-dl --choose-files [https://mega.nz/...]```

**Limit the download speed** in KiB/s

```megatools-dl --limit-speed [speed] [https://mega.nz/...]```

# SYNOPSIS

**megatools-dl** [_options_] _URL_

# PARAMETERS

**--path _directory_**
> Download files to the specified directory

**--choose-files**
> Interactively select which files to download from folders

**--limit-speed _KiB/s_**
> Limit download bandwidth

**--no-progress**
> Disable progress indicator

**--print-names**
> Print downloaded file names to stdout

# DESCRIPTION

**megatools-dl** downloads files and folders from mega.nz cloud storage links. Part of the **megatools** suite, it provides command-line access to Mega's file hosting service without requiring an account for public links.

The tool handles both file links and folder links, automatically creating directory structures for folder downloads. It supports resuming interrupted downloads and can limit bandwidth consumption.

For protected links or private files, authentication can be provided via configuration file or command-line options from the megatools suite.

# CAVEATS

Mega.nz link formats change occasionally; ensure megatools is up to date. Large downloads may be subject to Mega's transfer quotas. Password-protected links require the decryption key in the URL or entered interactively.

# SEE ALSO

[megatools](/man/megatools)(1), [wget](/man/wget)(1), [curl](/man/curl)(1), [aria2c](/man/aria2c)(1)

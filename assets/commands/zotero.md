# TAGLINE

Open-source reference management software

# TLDR

**Launch Zotero**

```zotero```

**Open specific profile**

```zotero -P [profile_name]```

**Open with profile manager**

```zotero -ProfileManager```

**Import from file**

```zotero -import [file.bib]```

**Open URL in Zotero**

```zotero zotero://select/library/items/[ITEM_KEY]```

# SYNOPSIS

**zotero** [_options_] [_URL_]

# PARAMETERS

**-P** _profile_
> Start with specified profile

**-ProfileManager**
> Open profile manager at startup

**-import** _file_
> Import from specified file

**-url** _url_
> Open specified URL

**-jsconsole**
> Open JavaScript console

**-purgecaches**
> Clear all caches on startup

**-ZoteroDebugText**
> Enable debug output to terminal

**--help**
> Display help message

# DESCRIPTION

**Zotero** is a free, open-source reference management software. It helps collect, organize, cite, and share research materials including articles, books, reports, web pages, and more.

Key features:
- Import references from databases, library catalogs, and web pages
- Organize with collections, tags, and saved searches
- Generate citations and bibliographies in various formats
- Sync library across devices via Zotero account
- Collaborate through shared group libraries

Zotero integrates with word processors (Word, LibreOffice, Google Docs) for in-document citation insertion and automatic bibliography generation.

Data is stored locally by default, with optional cloud sync. Browser connectors capture references directly from web pages.

# CAVEATS

Storage sync (for PDFs) has limited free quota. Self-hosting via WebDAV is possible.

Some publisher sites require specific browser connector configurations for proper metadata capture.

Large libraries with many attachments can consume significant disk space.

Offline access requires library data to be synced locally.

# SEE ALSO

[jabref](/man/jabref)(1), [mendeley](/man/mendeley)(1), [papis](/man/papis)(1)

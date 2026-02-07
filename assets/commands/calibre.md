# TAGLINE

Ebook management and format conversion suite

# TLDR

**Start** Calibre GUI

```calibre```

**Add** book to library

```calibredb add [book.epub]```

**Convert** ebook format

```ebook-convert [input.epub] [output.mobi]```

**Start** content server

```calibre-server```

**Edit** ebook

```ebook-edit [book.epub]```

# SYNOPSIS

**calibre**

# DESCRIPTION

**calibre** is a comprehensive ebook management application. It provides ebook library organization, format conversion, metadata editing, ebook syncing to devices, and a built-in reader and editor.

The application supports virtually all ebook formats and most ebook readers.

# COMPONENTS

**calibre**
> Main GUI application

**calibredb**
> Command-line library management

**ebook-convert**
> Format conversion

**ebook-edit**
> EPUB editor

**calibre-server**
> Web-based library access

**ebook-viewer**
> Ebook reader

# FEATURES

- Library management
- Format conversion (25+ formats)
- Metadata editing and download
- News downloading from websites
- Ebook editing
- Device syncing
- Content server (web access)
- Search and filtering
- Custom columns and tags

# SUPPORTED FORMATS

**Input:** EPUB, MOBI, AZW, PDF, HTML, TXT, and 20+ more
**Output:** EPUB, MOBI, AZW3, PDF, TXT, and more

# COMMAND-LINE USAGE

```bash
# Add book
calibredb add book.epub

# List books
calibredb list

# Convert format
ebook-convert input.epub output.mobi

# Start server
calibre-server /path/to/library

# Fetch metadata
fetch-ebook-metadata --isbn 9780123456789
```

# CONFIGURATION

**~/.config/calibre/**
> Configuration directory containing preferences, plugins, and library settings

# CAVEATS

Large library can be slow. DRM removal not included (requires plugins). Qt-based (larger footprint). Some conversions imperfect. Kindle's AZW3 support requires Amazon account for some features.

# HISTORY

**Calibre** was created by Kovid Goyal in **2006** to manage ebooks and became the de facto standard for ebook management and conversion.

# SEE ALSO

[ebook-convert](/man/ebook-convert)(1), [calibredb](/man/calibredb)(1), [pandoc](/man/pandoc)(1)

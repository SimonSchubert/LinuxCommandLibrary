# TLDR

**Show metadata**

```ebook-meta [book.epub]```

**Set title**

```ebook-meta [book.epub] --title "[New Title]"```

**Set author**

```ebook-meta [book.epub] --authors "[Author Name]"```

**Set cover**

```ebook-meta [book.epub] --cover [cover.jpg]```

**Get cover image**

```ebook-meta [book.epub] --get-cover [cover.jpg]```

**Set multiple fields**

```ebook-meta [book.epub] --title "[Title]" --authors "[Author]" --publisher "[Publisher]"```

# SYNOPSIS

**ebook-meta** _file_ [_options_]

# DESCRIPTION

**ebook-meta** reads and writes metadata in ebook files. Part of Calibre, it handles various formats including EPUB, MOBI, AZW3, and PDF.

The tool can display existing metadata and modify fields like title, author, publisher, date, and cover image without converting the file.

# PARAMETERS

**--title** _title_
> Set book title.

**--authors** _names_
> Set authors (comma-separated).

**--publisher** _name_
> Set publisher.

**--date** _date_
> Set publication date.

**--isbn** _isbn_
> Set ISBN.

**--tags** _tags_
> Set tags (comma-separated).

**--series** _name_
> Set series name.

**--series-index** _n_
> Set position in series.

**--cover** _file_
> Set cover from image.

**--get-cover** _file_
> Extract cover to file.

**--language** _lang_
> Set language.

**--comments** _text_
> Set description/comments.

# CAVEATS

Not all formats support all metadata fields. PDF metadata limited. Changes are in-place by default. Some metadata requires specific format support.

# HISTORY

**ebook-meta** is part of **Calibre**, created by **Kovid Goyal** in **2006**. It provides command-line access to Calibre's metadata editing capabilities, essential for batch processing and scripting.

# SEE ALSO

[ebook-convert](/man/ebook-convert)(1), [calibre](/man/calibre)(1), [exiftool](/man/exiftool)(1)

# TLDR

**Delete title** from a Matroska file

```mkvpropedit -d title [path/to/file.mkv]```

Mark subtitle track 3 as **SDH** (subtitles for deaf and hearing impaired)

```mkvpropedit [path/to/file.mkv] -e track:s3 -s flag-hearing-impaired=1```

Mark audio track 2 as **default**

```mkvpropedit [path/to/file.mkv] -e track:a2 -s flag-default=1```

**Delete name** of video track 1

```mkvpropedit [path/to/file.mkv] -e track:v1 -d name```

Set **track language** for audio track 1

```mkvpropedit [path/to/file.mkv] -e track:a1 -s language=eng```

**List all editable properties**

```mkvpropedit -l```

# SYNOPSIS

**mkvpropedit** [_options_] _source-filename_ [**-e** _selector_] [**-s** _name=value_] [**-d** _name_]

# PARAMETERS

**-e, --edit _selector_**
> Select segment info or track to edit (info, track:n, track:an, track:vn, track:sn)

**-s, --set _name=value_**
> Set property value; creates if not exists

**-a, --add _name=value_**
> Add property; allows duplicates

**-d, --delete _name_**
> Remove property

**-t, --tags _selector:filename_**
> Add, replace, or remove tags

**-c, --chapters _filename_**
> Add, replace, or remove chapters

**--add-attachment _filename_**
> Attach file to container

**--delete-attachment _selector_**
> Remove attachment

**-l, --list-property-names**
> Display all editable properties with descriptions

**-p, --parse-mode _mode_**
> Set parsing mode: fast (default) or full for damaged files

**-v, --verbose**
> Show Matroska elements as processed

# DESCRIPTION

**mkvpropedit** modifies properties of existing Matroska files without requiring a complete remux. It can edit segment information (titles, UIDs), track headers (language codes, names, flags), chapters, tags, and attachments.

Track selectors use the format track:TYPE_NUMBER where TYPE is v (video), a (audio), s (subtitle), or b (button), and NUMBER starts at 1. Using track:n selects the nth track regardless of type.

# CAVEATS

Changes modify the original file in place. Property names must match exactly; use -l to list valid names. Some properties cannot be added to tracks that do not already contain them. Language changes affect both IETF and legacy language elements by default.

# HISTORY

**mkvpropedit** is part of **MKVToolNix**, developed by **Moritz Bunkus**. MKVToolNix provides a complete suite of tools for creating, inspecting, and modifying Matroska multimedia container files.

# SEE ALSO

[mkvmerge](/man/mkvmerge)(1), [mkvinfo](/man/mkvinfo)(1), [mkvextract](/man/mkvextract)(1)

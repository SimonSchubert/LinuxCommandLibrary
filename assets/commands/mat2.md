# TAGLINE

removes metadata from files to protect privacy

# TLDR

**Remove metadata from file**

```mat2 [file.jpg]```

**Check for metadata** (don't modify)

```mat2 --show [file.pdf]```

**Remove metadata in place**

```mat2 --inplace [file.docx]```

**Process all files in directory**

```mat2 [*.jpg]```

**Lightweight cleaning** (faster, less thorough)

```mat2 --lightweight [video.mp4]```

**List supported formats**

```mat2 --list```

**Check dependencies**

```mat2 --check-dependencies```

# SYNOPSIS

**mat2** [_-s_] [_--inplace_] [_-L_] [_options_] _files_

# PARAMETERS

**-s**, **--show**
> List harmful metadata detectable by mat2 without removing them.

**--inplace**
> Clean files in place, without creating a backup.

**-L**, **--lightweight**
> Remove some metadata, trading thoroughness for the guarantee that file data is not modified.

**-l**, **--list**
> List all supported file formats.

**--check-dependencies**
> Check if mat2 has all the dependencies it needs.

**--no-sandbox**
> Disable bubblewrap's sandboxing.

**--unknown-members** _POLICY_
> Policy for handling unknown members of archive-style files (abort, omit, keep).

**-V**, **--verbose**
> Show more verbose status information.

**-v**, **--version**
> Show version number and exit.

**-h**, **--help**
> Show help message and exit.

# DESCRIPTION

**mat2** (Metadata Anonymisation Toolkit 2) removes metadata from files to protect privacy. It strips identifying information from images, documents, audio, and video.

Images may contain EXIF data with camera model, GPS coordinates, timestamps, and software used. Documents embed author names, revision history, and editing times. Audio files include artist, encoding software, and recording details.

By default, mat2 creates cleaned copies with `.cleaned` inserted between the filename and extension (e.g., `file.cleaned.jpg`). Inplace mode modifies originals directly. The show option reveals metadata without modification.

Supported formats include JPEG, PNG, PDF, DOCX, ODT, MP3, MP4, FLAC, and many others. Archive formats (ZIP, TAR) are processed recursively.

Lightweight mode provides faster cleaning for formats like video where full processing is slow, at the cost of less thorough metadata removal.

# CAVEATS

Some metadata cannot be removed without re-encoding (video). Very thorough cleaning may alter file characteristics. Some format-specific metadata may persist. Not all formats supported.

# HISTORY

**mat2** succeeded the original MAT (Metadata Anonymisation Toolkit) created by the **Tails** project. The rewrite in **2018** by **Julien Voisin** improved format support and reliability. It's used by journalists, activists, and privacy-conscious users.

# SEE ALSO

[exiftool](/man/exiftool)(1), [exiv2](/man/exiv2)(1), [pdfinfo](/man/pdfinfo)(1), [ffprobe](/man/ffprobe)(1)

# TAGLINE

Inspect, organize, and prepare photographs from the shell

# TLDR

**Show** metadata for one JPEG or Sony ARW file

```photoc exif [photo.jpg]```

**Summarize** a folder, including nested directories

```photoc stats [./photos] --recursive```

**Find** high-ISO shots and print their paths

```photoc query [./photos] --iso "[>800]" --aperture "[<=4]"```

**Preview** a rename, then apply it

```photoc rename [./photos] --format '{date}_{camera}_{sequence}.{ext}'```

```photoc rename [./photos] --format '{date}_{camera}_{sequence}.{ext}' --apply```

**Sort** into date folders, still as a preview

```photoc sort [./photos] --by date --recursive```

Write a **smaller copy** next to the original

```photoc compress [photo.jpg] --quality [75]```

**Strip GPS** EXIF tags into a new file

```photoc scrub [photo.jpg] --gps```

# SYNOPSIS

**photoc** _command_ [_options_] [_paths_]

**photoc** **--help**

**photoc** **--version**

# PARAMETERS

**-h**, **--help**

> Global help, or help for a command when one is given. The program exits without running the command.

**-V**, **--version**

> Print the version. Cannot be combined with a command or **--help**.

**-v**, **--verbose**

> Keep the normal result and add scan counts and paths on standard error. Cannot be combined with **--quiet**.

**-q**, **--quiet**

> Keep the requested result and hide summaries and non-critical warnings. Errors stay on standard error. Cannot be combined with **--verbose**.

**--no-progress**

> Hide the progress meter on long directory scans.

**--json**

> Print JSON for **exif**, **stats**, **timeline**, **duplicates**, **focus**, **check**, and **query**. Other commands reject it.

**--recursive**

> Descend into subdirectories. The default scan is one directory level and does not follow symlinks. Requires a directory for the commands that check.

**--apply**

> **rename** and **sort** only. Perform the plan after every entry passes the preflight check. Without it, both commands only print the plan.

**--format** _template_

> **rename** only. Required filename template. Placeholders include **{date}**, **{datetime}**, **{camera}**, **{make}**, **{iso}**, **{aperture}**, **{focal}**, **{sequence}**, **{original}**, and **{ext}**.

**--by** _date|session_

> **sort** only. Required layout. **date** creates **YYYY/MM/DD/** directories. **session** creates **session-001/** and so on.

**--gap** _duration_

> Session length for **timeline** and for **sort --by session**. A nonnegative integer plus **m** or **h**, such as **30m** or **2h**. The default is **60** minutes.

**--quality** _n_

> JPEG quality for **compress** (default **80**) or **contact** (default **85**, range **1**-**100**). On **compress**, it cannot be combined with **--target**.

**--target** _size_

> **compress** only. Largest output size to aim for, as a positive byte count with an optional suffix. Searches downward from high quality. Cannot be combined with **--quality**.

**--min-quality** _n_

> **compress** only. Lowest quality **--target** may use. The default is **20**. Requires **--target**.

**--output-dir** _directory_

> **compress** only. Write copies under this directory, keeping paths relative to the input directory. The default is beside each source, with **.compressed** inserted before the extension.

**--gps**

> **scrub** only. Required. Remove the EXIF GPS directory and its pointer.

**--in-place**

> **scrub** only. Replace the original after a verified temporary file is written. There is no backup. The default writes a **.scrubbed** copy.

**--output** _sheet.jpg_

> **contact** only. Required path of the contact sheet. Further pages insert **-001**, **-002**, and so on before the extension.

**--only-errors**

> **check** only. Hide **OK** and **WARNING** rows. Summary counts still include every file.

**--only-blurry**

> **focus** only. Print rows whose sharpness score is below **--threshold**. The summary still covers every analyzed JPEG.

**--threshold** _n_

> **focus** only. Scores strictly below this nonnegative number are labeled possibly blurry. The default is **100**.

**--print0**

> **query** only. Print matching paths separated by NUL, for **xargs -0**. Cannot be combined with **--json**.

**--camera** _model_, **--make** _maker_, **--iso** _expr_, **--aperture** _expr_, **--focal** _expr_, **--after** _date_, **--before** _date_, **--has-gps**, **--no-gps**

> **query** filters. All of them are combined. Numeric expressions look like **100**, **>100**, or **<=4**. Dates are **YYYY-MM-DD**.

# DESCRIPTION

**photoc** is a command-line toolkit for local photographs. It reads metadata, summarizes a folder, finds exact duplicate files, checks JPEG structure, estimates sharpness, builds contact sheets, writes recompressed copies, renames and sorts files, and removes EXIF GPS tags. Results go to standard output. Diagnostics go to standard error.

**exif** prints one JPEG or Sony ARW file: size, dimensions, camera, exposure, capture time, and GPS when those tags exist. **stats** and **timeline** summarize a directory. **timeline** groups photos by calendar date and then by the gap between capture times. **query** prints paths of JPEGs that match metadata filters. **duplicates** groups regular files of any type whose SHA-256 digests match. **check** decodes JPEG scans and reports structural and EXIF problems. **focus** ranks JPEGs by a Laplacian variance score, lowest first. **contact** writes JPEG contact sheets. **compress** writes a new JPEG and preserves EXIF, ICC, and standard XMP payloads it understands. **rename** and **sort** print a plan and change files only with **--apply**. **scrub --gps** writes a copy with EXIF GPS removed, or replaces the original with **--in-place**.

JPEG (**.jpg** and **.jpeg**) is the main format. **exif**, **stats**, **timeline**, **rename**, and **sort** also read common TIFF/EXIF metadata from Sony **.arw** files. They do not develop the RAW image. **query**, **check**, **compress**, **contact**, **focus**, and **scrub** stay JPEG-only.

There is no configuration file and no catalog. Option values are separate arguments: **--quality 75** is accepted, and **--quality=75** is not. Combined short flags are not accepted. A path that starts with a dash needs **--** before it.

# CAVEATS

**rename** and **sort** refuse the whole apply when any entry is blocked, including missing capture dates, collisions, and destinations that already exist. Apply tries to roll back after a later failure. It is not a crash-safe transaction. **compress** and the default **scrub** publish new files as they succeed, so a failure can leave earlier outputs in place. **scrub --in-place** deletes the need for a copy and keeps no backup. It refuses symlinks, hard links, and files whose owner or contents changed while it ran.

EXIF GPS removal does not remove location data stored in XMP, MakerNotes, filenames, or the picture itself. **compress** keeps EXIF GPS and XMP. Capture times are the recorded EXIF clock, with no timezone conversion and no fallback to the file's modification time.

**focus** is a review hint. Noise, texture, and JPEG artifacts move the score. **duplicates** ignores files that look alike but are not byte-identical. **check** is not a visual-quality or authenticity test. Sony ARW support covers a fixed set of classic TIFF/EXIF tags, not every camera generation, and it does not validate RAW pixels.

Exit status **0** is success, including an empty match list. **1** is an operational failure, and partial output may already exist. **2** is bad usage. **3** is reserved for a command that is not implemented.

macOS and Linux are the supported platforms. Other RAW formats and HEIC are not read.

# HISTORY

**photoc** is written in **C**. The manual page shipped in the repository is dated **September 29, 2026**.

# SEE ALSO

[exiftool](/man/exiftool)(1), [exiv2](/man/exiv2)(1), [identify](/man/identify)(1), [jpegoptim](/man/jpegoptim)(1)

# RESOURCES

```[Documentation](https://github.com/ahmetomerv/photoc/blob/main/docs/README.md)```

```[Source code](https://github.com/ahmetomerv/photoc)```

<!-- verified: 2026-10-06 -->

# TLDR

**Launch Brasero**

```brasero```

**Open an audio project**

```brasero --audio```

**Open a data project**

```brasero --data```

**Open specific project file**

```brasero --project [project.brasero]```

**Copy a disc**

```brasero --copy [/dev/sr0]```

**Open blank disc dialog**

```brasero --blank```

**Check disc integrity**

```brasero --check```

**Burn and remove project**

```brasero --burn-and-remove-project [project.brasero]```

# SYNOPSIS

**brasero** [_options_]

# DESCRIPTION

**brasero** is a GNOME application for burning CD/DVD media. It supports creating audio, video, and data discs, copying existing discs, burning ISO images, and blanking rewritable media.

The application features on-the-fly burning, multisession support, and automatic conversion of music playlists using GStreamer. It supports multiple backends including cdrtools, growisofs, and libburn.

# PARAMETERS

**-p, --project** _file_
> Open the specified project

**-a, --audio**
> Open an empty audio project

**-d, --data**
> Open an empty data project

**-c, --copy** _path_
> Copy a disc from specified device

**-j, --cover** _path_
> Cover image to use

**-e, --empty**
> Force display of project selection page

**-b, --blank**
> Open the blank disc dialog

**-k, --check**
> Open the check disc dialog

**-n, --ncb**
> Open data project with burn:/// URI contents

**-r, --burn-and-remove-project** _file_
> Burn project and remove file afterwards

# CAVEATS

Audio CD burning requires tracks in WAV or Ogg Vorbis format. Using lower burning speeds reduces the risk of burn errors. Requires appropriate optical drive hardware and supported backend tools.

# HISTORY

Brasero was developed as part of the GNOME desktop environment to provide a simple, user-friendly disc burning application. It integrates with Nautilus for drag-and-drop file operations.

# SEE ALSO

[wodim](/man/wodim)(1), [growisofs](/man/growisofs)(1), [cdrecord](/man/cdrecord)(1), [k3b](/man/k3b)(1)

# TAGLINE

Command-line client for digital cameras via libgphoto2

# TLDR

**Detect connected cameras** and the ports they are attached to

```gphoto2 --auto-detect```

**Capture an image** and keep it on the camera

```gphoto2 --capture-image```

**Capture an image** and download it immediately

```gphoto2 --capture-image-and-download```

**List all files** stored on the camera

```gphoto2 --list-files```

**Download a specific file** by index number

```gphoto2 --get-file [number]```

**Download every file** from the camera

```gphoto2 --get-all-files```

**Time-lapse capture** of 10 frames at 30 second intervals

```gphoto2 --capture-image-and-download -F 10 -I 30```

**Stream live preview** to stdout (useful as webcam source)

```gphoto2 --stdout --capture-movie```

# SYNOPSIS

**gphoto2** [_options_] _action_

# PARAMETERS

**--auto-detect**
> Detect cameras attached to the system.

**--list-cameras**
> Print list of all supported camera models.

**--list-ports**
> Print list of supported port types.

**--port** _PATH_
> Select a specific port (e.g. _usb:_ or _serial:/dev/ttyS0_).

**--camera** _MODEL_
> Force a specific camera model.

**-L**, **--list-files**
> List files in the current folder on the camera.

**-f** _FOLDER_, **--folder** _FOLDER_
> Switch to specified folder on the camera.

**-p** _RANGE_, **--get-file** _RANGE_
> Download files identified by number range (e.g. _1_, _1-4_, _1,3,5_).

**--get-all-files**
> Download every file from the current folder.

**--get-thumbnail** _RANGE_
> Download thumbnails rather than full files.

**--get-raw-data** _RANGE_
> Download raw sensor data.

**-u** _FILE_, **--upload-file** _FILE_
> Upload a file to the camera.

**-d** _RANGE_, **--delete-file** _RANGE_
> Delete files by number.

**-D**, **--delete-all-files**
> Delete every file in the current folder.

**--capture-image**
> Trigger the shutter and keep the image on the camera.

**--capture-image-and-download**
> Capture and immediately download the resulting file.

**--capture-movie** [_=COUNT_|_=SECONDSs_]
> Capture a movie or stream of preview frames.

**-F** _N_, **--frames** _N_
> Number of frames for time-lapse captures.

**-I** _SECONDS_, **--interval** _SECONDS_
> Seconds between frames during time-lapse.

**--filename** _TEMPLATE_
> Specify an output filename template (supports _%n_, _%C_, _%f_, etc.).

**--stdout**
> Write downloaded data to standard output instead of a file.

**--list-config**
> List all camera configuration entries.

**--get-config** _NAME_
> Print the current value of a configuration entry.

**--set-config** _NAME=VALUE_
> Set a configuration entry (e.g. _iso=400_, _shutterspeed=1/125_).

**--summary**
> Print a summary of the camera's capabilities.

**-q**, **--quiet**
> Reduce output verbosity.

**-h**, **--help**
> Show usage information.

# DESCRIPTION

**gphoto2** is the official command-line frontend for the **libgphoto2** library, providing access to more than **2500 digital cameras** over USB, serial, PTP/IP, and other transports. It lets photographers and developers capture images, download files, trigger the shutter, tether cameras to computers, and adjust settings without using the vendor software.

The tool operates on the current folder of the camera's storage; switch folders with **--folder** and query structure with **--list-folders** or **--list-files**. Each file is addressed by a 1-based index. Multiple actions may be combined on one command line and are executed sequentially.

For configuration, gphoto2 exposes the camera's property tree (exposure, ISO, white balance, focus mode, etc.) through **--list-config**, **--get-config**, and **--set-config**. This makes it a common building block for remote capture studios, observatory rigs, and Linux webcam setups (e.g. piping **--capture-movie** output into **ffmpeg** and **v4l2loopback**).

# CAVEATS

Not every camera supports every feature; PTP cameras usually allow capture and config, while older PTP-incompatible cameras expose only file transfer. Stop any desktop service that auto-mounts MTP/PTP cameras (e.g. _gvfs-gphoto2-volume-monitor_) before using gphoto2 directly; otherwise the USB device is held by another process. Long tethered sessions may require explicit power settings to prevent the camera from sleeping.

# HISTORY

The **gphoto** project was started in **1997** by **Scott Fritzinger** to give Linux users a common interface for consumer digital cameras. The second-generation library **libgphoto2** and its reference client **gphoto2** were released in **2001**, reworking the architecture around modular camlib drivers. The project is maintained by an open-source community and underpins camera support in desktop environments such as GNOME and KDE.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [v4l2-ctl](/man/v4l2-ctl)(1), [exiftool](/man/exiftool)(1), [darktable](/man/darktable)(1)

# TAGLINE

Open-source graphical audio editor for recording and editing sounds.

# TLDR

**Launch Audacity** graphical interface

```audacity```

**Open an audio file** for editing

```audacity [path/to/audio.wav]```

**Open multiple audio files**

```audacity [file1.wav] [file2.mp3] [file3.ogg]```

**Display version** information

```audacity -version```

**Display help** for command line options

```audacity -help```

**Set block size** for disk writes

```audacity -blocksize [4096] [path/to/audio.wav]```

# SYNOPSIS

**audacity** [**-help**]

**audacity** [**-version**]

**audacity** [**-blocksize** _nnn_] [_AUDIO-FILE_] ...

# PARAMETERS

**-help**
> Display a brief list of command line options.

**-version**
> Display the Audacity version number.

**-blocksize** _nnn_
> Set the Audacity block size for writing files to disk to nnn bytes.

**-test**
> Run self-diagnostic tests (only present in development builds).

# DESCRIPTION

**Audacity** is a free, open-source graphical audio editor for recording and editing sounds. It supports multiple audio formats including uncompressed formats (WAV, AIFF, AU) and compressed formats (MP3, Ogg Vorbis, FLAC) through external libraries.

Audacity provides multi-track editing, recording from various sources, effects processing, and format conversion. It supports LADSPA and Nyquist plugins for extended functionality. The editor is disk-based, meaning audio data is stored in a temporary directory during editing rather than entirely in memory.

Audacity is primarily an interactive graphical application. For batch processing or command-line audio manipulation, tools like sox or ecasound are more suitable.

# FILES

**~/.audacity-data/audacity.cfg**
> Per-user configuration file.

**/var/tmp/audacity-_user_/**
> Default location of the temporary directory. Should be on a fast local disk with ample free space.

# ENVIRONMENT

**AUDACITY_PATH**
> Directories searched before standard locations for plugins and configuration files.

**LADSPA_PATH**
> Additional directories searched for LADSPA plugins.

# CAVEATS

Audacity has limited command line functionality and is not designed for batch processing. The temporary directory requires significant disk space for large projects. Some audio formats (MP3, FFmpeg formats) require additional libraries to be installed.

# HISTORY

Audacity was started in **1999** by Dominic Mazzoni and Roger Dannenberg at Carnegie Mellon University. It became one of the most popular open-source audio editors, available across Linux, macOS, and Windows. In **2021**, the project was acquired by Muse Group, which led to community concerns about telemetry and privacy. The project continues development with regular releases.

# SEE ALSO

[sox](/man/sox)(1), [ecasound](/man/ecasound)(1), [ardour](/man/ardour)(1), [lame](/man/lame)(1)

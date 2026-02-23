# TAGLINE

Decrypt encrypted MP4 files

# TLDR

**Decrypt** an MP4 file using a track ID and key

```mp4decrypt --key [track_id]:[hex_key] [input.mp4] [output.mp4]```

**Decrypt** using a **KID** (Key ID) and key for MPEG-CENC content

```mp4decrypt --key [hex_kid]:[hex_key] [input.mp4] [output.mp4]```

**Decrypt** with **multiple keys** for separate audio and video tracks

```mp4decrypt --key 1:[hex_key1] --key 2:[hex_key2] [input.mp4] [output.mp4]```

**Decrypt** fragmented MP4 segments with a separate init file

```mp4decrypt --fragments-info [init.mp4] --key 1:[hex_key] [segment.m4s] [output.m4s]```

**Decrypt** with **progress** display

```mp4decrypt --show-progress --key 1:[hex_key] [input.mp4] [output.mp4]```

# SYNOPSIS

**mp4decrypt** [_options_] _input_ _output_

# PARAMETERS

**--key** _\<id\>_:_\<key\>_
> Specify a decryption key. _id_ is either a track ID (decimal) or a 128-bit KID (hex). _key_ is the 128-bit decryption key in hex. May be specified multiple times for different tracks.

**--fragments-info** _\<filename\>_
> Decrypt fragments using track information from a separate file. Used for fragmented MP4 workflows (DASH/HLS segments).

**--show-progress**
> Display progress details during decryption

# DESCRIPTION

**mp4decrypt** decrypts MP4 files that have been encrypted with content protection schemes. It is part of the **Bento4** SDK, a cross-platform C++ toolkit for working with ISO-MP4 files, MPEG-DASH, HLS, and CMAF. It is the decryption counterpart to **mp4encrypt**.

The tool auto-detects the encryption scheme from the input file metadata. Supported schemes include **MPEG-CENC** (AES-CTR), **MPEG-CBCS** (AES-CBC subsample pattern), **PIFF** (Microsoft PlayReady), **OMA-PDCF**, **Marlin IPMP**, and **ISMACRYP**. These cover the DRM systems commonly used in industry: Widevine, PlayReady, FairPlay, and Marlin.

For **OMA DCF** files, use **1** as the track index. For **Marlin IPMP/ACGK** encryption, use **0** as the track ID. KIDs (hex Key IDs) are only applicable to **MPEG-CENC** family encryption.

# CAVEATS

You must supply the decryption keys yourself; mp4decrypt does not fetch, derive, or crack keys. When decrypting fragmented MP4 segments, omitting **--fragments-info** can result in 0-byte output files, and in some cases the tool may silently produce output that is not actually decrypted. In several failure modes (wrong key, wrong key ID format), mp4decrypt may produce output files without reporting an error. The open-source version is licensed under **GPLv2** with copyleft requirements; commercial use requires a separate license from Axiomatic Systems.

# HISTORY

**mp4decrypt** is part of the **Bento4** toolkit created by **Gilles Boccon-Gibod** of **Axiomatic Systems, LLC**, with development dating back to **2002**. The toolkit was first publicly available on SourceForge around **2005** and has been continuously expanded to support modern encryption schemes (MPEG-CENC, CBCS) and adaptive streaming formats (DASH, HLS, CMAF). It has been forked by **Dolby Laboratories** and **XBMC/Kodi**.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [ffprobe](/man/ffprobe)(1)

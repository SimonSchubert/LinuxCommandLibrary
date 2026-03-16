# TAGLINE

PipeWire resampler debugging utility

# TLDR

**Resample** a WAV file to a different sample rate

```spa-resample -r [48000] [input.wav] [output.wav]```

**Resample** with a specific output **format**

```spa-resample -r [48000] -f [s32] [input.wav] [output.wav]```

**Resample** with **highest quality** setting

```spa-resample -q 14 -r [48000] [input.wav] [output.wav]```

**Resample** with **verbose** output

```spa-resample -v -r [44100] -f [f32] [input.wav] [output.wav]```

# SYNOPSIS

**spa-resample** [_OPTIONS_] _INFILE_ _OUTFILE_

# PARAMETERS

**-r** _RATE_, **--rate=**_RATE_
> Output sample rate.

**-f** _FORMAT_, **--format=**_FORMAT_
> Output sample format (**s8** | **s16** | **s32** | **f32** | **f64**).

**-q** _QUALITY_, **--quality=**_QUALITY_
> Resampler output quality (**0**-**14**). Higher values produce better quality at the cost of more CPU usage.

**-c** _FLAGS_, **--cpuflags=**_FLAGS_
> CPU feature flags for SIMD optimization selection. See spa/support/cpu.h for details.

**-v**
> Verbose operation.

**-h**
> Show help.

# DESCRIPTION

**spa-resample** is a command-line utility that uses the PipeWire SPA resampler to convert audio files from one sample rate and format to another. It reads a WAV input file, applies resampling with the specified parameters, and writes the result to a WAV output file.

The tool is primarily intended for **testing and debugging** the PipeWire resampler implementation rather than as a general-purpose audio conversion tool. It provides direct access to the same resampling algorithm that PipeWire uses internally for audio stream processing, making it useful for verifying resampler behavior and quality.

# CAVEATS

This tool is designed for testing and debugging purposes only, not for production audio conversion workflows. For general-purpose audio format conversion, dedicated tools like **sox** or **ffmpeg** are more appropriate. Only WAV files are supported as input and output formats. The quality parameter range of 0-14 is specific to the PipeWire SPA resampler and does not correspond to quality scales used by other resamplers.

# HISTORY

**spa-resample** is part of the **PipeWire** multimedia framework, which was created by **Wim Taymans** and first released in **2017**. PipeWire was designed as a unified audio and video server to replace both **PulseAudio** and **JACK** on Linux systems. The spa-resample utility provides standalone access to PipeWire's built-in SPA (Simple Plugin API) resampler, which supports multiple SIMD-optimized backends for efficient sample rate conversion.

# SEE ALSO

[pipewire](/man/pipewire)(1), [pw-cli](/man/pw-cli)(1), [pw-cat](/man/pw-cat)(1), [sox](/man/sox)(1), [ffmpeg](/man/ffmpeg)(1)

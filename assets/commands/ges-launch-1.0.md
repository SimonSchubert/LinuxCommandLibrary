# TAGLINE

Create and render GStreamer multimedia timelines

# TLDR

**Play back a media file** on the timeline

```ges-launch-1.0 +clip [path/to/file.mp4]```

**Render a timeline** to an output file

```ges-launch-1.0 +clip [path/to/input.mp4] -o file:///[path/to/output.webm]```

**Add a clip with a specific duration** (in nanoseconds)

```ges-launch-1.0 +clip [path/to/file.mp4] duration=[5000000000]```

**Apply a video effect** to a clip

```ges-launch-1.0 +clip [path/to/file.mp4] +effect videobalance saturation=[0.0]```

**Load an existing project** file

```ges-launch-1.0 -l [path/to/project.xges]```

**Add a title clip** to the timeline

```ges-launch-1.0 +title text="[Hello World]" duration=[3000000000]```

# SYNOPSIS

**ges-launch-1.0** [_options_] [_commands_]

# PARAMETERS

**-h**, **--help**
> Display help options.

**--help-all**
> Display all available help options.

**--help-gst**
> Display GStreamer-specific options.

**-l**, **--load** _URI_
> Load an existing project from a .xges file.

**-s**, **--save** _URI_
> Save the current timeline to a project file before rendering.

**-p**, **--sample-path** _PATH_
> Search for missing assets in the specified directory.

**-o**, **--outputuri** _URI_
> Render the timeline to the given file URI instead of playing it back.

**-f**, **--format** _PROFILE_
> Specify the encoding profile from the command line.

**-e**, **--encoding-profile** _PRESET_
> Use an encoding profile preset.

**-t**, **--track-types** _TYPES_
> Define which track types to create (audio, video, or both).

**-v**, **--videosink** _SINK_
> Set the video output sink for playback.

**-a**, **--audiosink** _SINK_
> Set the audio output sink for playback.

**-m**, **--mute**
> Mute audio and video during playback.

**--disable-mixing**
> Disable layer mixing and compositing.

**--list-transitions**
> List all valid transition types and exit.

**-r**, **--repeat** _N_
> Repeat the timeline _N_ times.

# TIMELINE COMMANDS

**+clip** _URI_ [_inpoint=ns_] [_duration=ns_] [_start=ns_] [_layer=n_]
> Add a media clip to the timeline. Times are in nanoseconds.

**+effect** _BIN-DESCRIPTION_
> Apply a GStreamer bin effect to the preceding clip (uses gst-launch syntax).

**+title** [_text=STRING_] [_duration=ns_]
> Insert a title text clip into the timeline.

**set-** _PROPERTY_ _VALUE_
> Set a property on a timeline object (clip, effect) by name.

# DESCRIPTION

**ges-launch-1.0** is the command-line tool for the **GStreamer Editing Services** (GES) library. It constructs multimedia timelines from clips, effects, and titles, then either plays them back in real time or renders them to a file in a specified format. Timelines can be built from command-line arguments or loaded from existing **.xges** project files.

The tool leverages the full GStreamer pipeline framework, meaning any format or codec supported by GStreamer can be used for input and output. It is commonly used for quick video editing tasks, automated rendering pipelines, and testing GES functionality.

# CAVEATS

Duration and time values are specified in **nanoseconds**, which can be unintuitive (1 second = 1000000000). The rendering format depends on available GStreamer plugins and encoding profiles; missing plugins will cause silent failures or cryptic errors. Complex timelines are better managed through the .xges project file format or a GUI editor like **Pitivi** rather than long command-line invocations.

# HISTORY

GES was developed as part of the **GStreamer** project to provide a high-level editing API on top of GStreamer's media framework. The **ges-launch-1.0** tool was introduced alongside the GES library to allow command-line timeline construction and rendering. It is closely tied to the **Pitivi** video editor, which uses GES as its backend engine. The tool follows the GStreamer 1.x versioning scheme.

# SEE ALSO

[gst-launch-1.0](/man/gst-launch-1.0)(1), [gst-inspect-1.0](/man/gst-inspect-1.0)(1), [ffmpeg](/man/ffmpeg)(1)

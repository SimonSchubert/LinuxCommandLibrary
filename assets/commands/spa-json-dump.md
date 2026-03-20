# TAGLINE

SPA JSON to standard JSON converter

# TLDR

**Convert a PipeWire configuration file** to standard JSON

```spa-json-dump /usr/share/pipewire/pipewire.conf```

**Convert a SPA JSON file** and pretty-print with jq

```spa-json-dump [path/to/file.conf] | jq .```

**Read SPA JSON from stdin** and output as standard JSON

```cat [path/to/file.conf] | spa-json-dump```

# SYNOPSIS

**spa-json-dump** [_FILE_]

# DESCRIPTION

**spa-json-dump** reads a SPA JSON file or standard input and outputs it as standard JSON. SPA JSON is a lightweight JSON variant used by PipeWire for its configuration files. The SPA JSON parser is intentionally relaxed and can handle a wide range of JSON-like syntax, including unquoted strings and comments, which are not valid in strict JSON. This tool bridges the gap by converting SPA JSON into standards-compliant JSON that can be processed by tools like **jq** or any JSON parser.

# CAVEATS

The tool has no options beyond the optional file argument. If the input is not valid SPA JSON, the output may be malformed or empty without a clear error message. Only useful for PipeWire SPA JSON files; standard JSON files will pass through unchanged.

# HISTORY

**spa-json-dump** was introduced as part of the **PipeWire** project, the modern audio and video server for Linux that replaced PulseAudio and JACK in many distributions. PipeWire uses its own SPA (Simple Plugin API) JSON format for configuration, and this tool was created to make those config files interoperable with standard JSON tooling.

# SEE ALSO

[pipewire](/man/pipewire)(1), [jq](/man/jq)(1), [pw-dump](/man/pw-dump)(1)

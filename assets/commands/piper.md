# TLDR

**Synthesize speech**

```echo "Hello world" | piper --model [en_US-lessac-medium] --output_file [output.wav]```

**List models**

```piper --list-models```

**Use specific model**

```piper -m [model.onnx] -c [model.json] < [input.txt] > [output.wav]```

**Set speaker**

```piper --model [model.onnx] --speaker [0] < [input.txt]```

**Adjust speaking rate**

```piper --model [model.onnx] --length_scale [1.5] < [input.txt]```

**JSON input mode**

```echo '{"text": "Hello"}' | piper --model [model.onnx] --json-input```

# SYNOPSIS

**piper** [_--model file_] [_--output_file file_] [_options_]

# PARAMETERS

**-m**, **--model** _FILE_
> ONNX model file.

**-c**, **--config** _FILE_
> JSON config file.

**--output_file** _FILE_
> Output WAV file.

**--output_dir** _DIR_
> Output directory.

**--speaker** _ID_
> Speaker ID for multi-speaker.

**--length_scale** _FLOAT_
> Speaking rate (higher=slower).

**--noise_scale** _FLOAT_
> Variation in speech.

**--json-input**
> JSON input format.

**--list-models**
> Show available models.

# DESCRIPTION

**piper** is a fast, local neural text-to-speech system. It generates natural-sounding speech from text.

Models are language and voice specific. Many voices available for common languages.

Processing is local and fast. No internet connection required after model download.

Multi-speaker models support different voices. Speaker ID selects voice variant.

Rate and variation parameters tune output. Length scale adjusts speaking speed.

# CAVEATS

Requires model download. Quality varies by model. GPU acceleration optional.

# HISTORY

**Piper** was created by **Michael Hansen** (rhasspy) for offline voice assistants. It provides fast, high-quality TTS suitable for embedded and edge devices.

# SEE ALSO

[espeak](/man/espeak)(1), [festival](/man/festival)(1), [mimic](/man/mimic)(1), [say](/man/say)(1)

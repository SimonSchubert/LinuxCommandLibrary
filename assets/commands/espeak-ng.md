# TAGLINE

next-generation formant-based speech synthesis

# TLDR

**Speak text**

```espeak-ng "[Hello world]"```

**Use specific voice**

```espeak-ng -v [en-gb] "[Hello]"```

**Read from file**

```espeak-ng -f [document.txt]```

**Output to WAV**

```espeak-ng -w [output.wav] "[Hello]"```

**Adjust speaking rate**

```espeak-ng -s [175] "[Hello]"```

**List voices**

```espeak-ng --voices```

**Use phoneme input**

```espeak-ng -x "[h@l'oU]"```

# SYNOPSIS

**espeak-ng** [_options_] [_words_]

# PARAMETERS

_WORDS_
> Text to speak.

**-v** _VOICE_
> Select voice/language.

**-f** _FILE_
> Read from file.

**-w** _FILE_
> Write to WAV file.

**-s** _SPEED_
> Words per minute.

**-p** _PITCH_
> Pitch adjustment.

**-p** _PITCH_
> Pitch adjustment (0 to 99, default 50).

**-a** _AMPLITUDE_
> Amplitude/volume (0 to 200, default 100).

**-g** _GAP_
> Word gap, in units of 10 ms.

**-x**
> Write the translated phoneme mnemonics to stdout instead of speaking.

**--ipa**
> Write phonemes using the International Phonetic Alphabet.

**--stdout**
> Write the audio as WAV data to standard output.

**--voices**[=_lang_]
> List available voices, optionally filtered by language.

**--help**
> Display help information.

# DESCRIPTION

**espeak-ng** (eSpeak New Generation) is a fork of eSpeak with active development, additional features, and improved voice quality. It's a formant-based speech synthesizer supporting 100+ languages.

The tool provides text-to-speech capabilities for accessibility, voice assistants, and applications. It includes improvements in pronunciation rules, language support, and phoneme handling over the original eSpeak.

espeak-ng is the default TTS engine in many Linux distributions and speech synthesis frameworks.

# CAVEATS

Still sounds robotic (formant synthesis). Some advanced SSML features unsupported. Voice quality varies by language. Output format options limited.

# HISTORY

espeak-ng was forked from eSpeak by **Reece H. Dunn** to continue development after the original project became inactive. It's now the actively maintained version used in most Linux distributions.

# INSTALL

```apt: sudo apt install espeak-ng```

```dnf: sudo dnf install espeak-ng```

```pacman: sudo pacman -S espeak-ng```

```apk: sudo apk add espeak-ng```

```zypper: sudo zypper install espeak-ng```

```brew: brew install espeak-ng```

```nix: nix profile install nixpkgs#espeak-ng```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[espeak](/man/espeak)(1), [festival](/man/festival)(1), [mimic](/man/mimic)(1), [pico2wave](/man/pico2wave)(1)

# RESOURCES

```[Source code](https://github.com/espeak-ng/espeak-ng)```

```[Documentation](https://github.com/espeak-ng/espeak-ng/blob/master/docs/guide.md)```

<!-- verified: 2026-07-14 -->

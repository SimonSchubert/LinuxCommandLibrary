# TAGLINE

word-timed captions cut per screen shape

# TLDR

**Re-cut subtitles** offline into wide and tall captions

```overtone recut [talk.srt]```

**Transcribe** a video with the cloud defaults

```overtone transcribe [talk.mp4] --language en```

Show providers, data flow and estimated cost, and **send nothing**

```overtone transcribe [talk.mp4] --language en --dry-run```

**Transcribe offline** with whisper.cpp and Ollama

```overtone transcribe [talk.mp4] --local --language en```

Name speakers on an existing document **without a new transcription**

```overtone recut [talk.overtone.json] --speakers "S1=Sarah,S2=Tom" --out [named]```

**Check** a document against the format rules

```overtone validate [talk.overtone.json]```

**Export** WebVTT and SRT for one profile

```overtone export [talk.overtone.json] --export vtt,srt --profiles vertical --out [captions]```

**Burn captions** into an MP4

```overtone burn [talk.mp4] [talk.overtone.json] --style social```

List speech and editor **providers**

```overtone providers```

# SYNOPSIS

**overtone** _command_ [_options_] [_arguments_]

# PARAMETERS

**transcribe** _MEDIA_
> Turn an audio or video file into an .overtone.json document, plus WebVTT by default. Needs ffmpeg and ffprobe. Cloud default: OpenAI (gpt-transcribe) for the words, Azure Speech (fast) for times and speakers, and OpenAI (gpt-6.1-sol) as the editor.

**recut** _FILE_
> Re-cut a SubRip, WebVTT or .overtone.json file for each profile. Offline. No API keys and no ffmpeg. Default exports are json, vtt, srt and txt.

**validate** _FILE_
> Check an .overtone.json file against the format rules.

**export** _FILE_
> Write json, player, vtt, vtt-words, srt or txt from an .overtone.json file. Default formats are vtt, srt and txt. player is the JSON document without authoring data.

**burn** _MEDIA_ _DOCUMENT_
> Write an MP4 with captions drawn like the video.js player. Needs ffmpeg 5 or later and Chrome or Chromium. Default style pack is clean. Output defaults to a .captioned.mp4 next to the media.

**init** [**--force**]
> Write overtone.config.json in the working directory with the current rule set, default models and built-in profile rules pinned. Refuses to overwrite unless **--force** is set.

**languages** [_CODE_]
> List language packs and their coverage, or print one pack (for example nl).

**providers** [_ID_]
> List providers, roles, default models and the environment variables each one reads. Pass an id such as whisper-cpp for one provider.

**--language** _CODE_
> Spoken language, auto, or a comma-separated candidate list with the main language first (en,es).

**--profiles** _IDS_
> Screen shapes by name or aspect. Default is horizontal,vertical. On transcribe, a video also gets a profile for its own shape when those two do not cover it.

**--export** _FORMATS_
> Comma-separated: json, player, vtt, vtt-words, srt, txt, and on transcribe also mp4.

**-o**, **--out** _DIR_
> Output folder. Default is next to the input. For burn, a file path or a folder.

**--text** _PROVIDER:MODEL_
> Text provider. Default openai:gpt-transcribe.

**--timing** _PROVIDER[:MODEL]_
> Timing and diarization provider. Default azure-speech. same reuses the text provider's word times.

**--llm** _PROVIDER:MODEL_
> Editor model. Default openai:gpt-6.1-sol.

**--local**
> whisper.cpp large-v3-turbo for words and times, and Ollama qwen3:8b as the editor. No API keys. Explicit provider flags still win.

**--context** _TEXT_
> What the media is about. Without it, one short model call infers a context unless **--no-infer-context** is set.

**--glossary** _PATH_
> One term per line. Those terms are not split across caption lines.

**--speakers** _LIST_
> Pin labels, for example S1=Sarah,S2=Tom.

**--rules** _ID_
> Caption layout rule set. latest (default) follows upgrades. A pinned id such as 1 keeps the same breaks after an upgrade.

**--dry-run**
> On transcribe: print providers, where the audio would go, missing keys, outputs and estimated cost, then stop. Exit status is 1 when the run could not proceed. No request, extraction, cache write or output file.

**--text-file** _PATH_
> Use an existing .srt, .vtt or .txt as the words. The timing provider times that text.

**--style** _NAME|PATH_
> On burn: clean, high-contrast, lumora, minimal, social, or a path to a pack's style.css.

**--config** _PATH_
> Config file. Default is ./overtone.config.json.

**--help**
> Show help. **--version** prints the package version.

# DESCRIPTION

**overtone** is the command from the npm package **overtone-captions**. It stores each spoken word once, with a time and a speaker, and cuts captions separately for each picture shape (16:9 and 9:16 by default, or any aspect you name). The document is a .overtone.json file. Exports are WebVTT, SubRip and plain text per cut, and on request an MP4 with the captions burned in.

Install with npm (`npm install -g overtone-captions`). The binary name is **overtone**. `npx overtone-captions` runs that same binary once. Node.js 22.12 or newer is required.

A transcribe run can ask several engines to hear the audio. Where they disagree, a text vote picks the words. An editor model corrects names and terms, labels speakers and can mark key words. Versioned rules cut the lines. The editor never sets timestamps: each word keeps the time the speech engines reported. **recut** does the line cutting alone, offline, and estimates word times from existing subtitle cues unless the input is already an overtone document.

With cloud defaults, audio goes to the speech providers and the transcript, context, glossary and style settings go to the editor. **--local** keeps whisper.cpp and Ollama on this machine. A cache under .overtone reuses saved provider answers when a run is repeated.

# CONFIGURATION

Optional **overtone.config.json** in the working directory (override with **--config**). Keys are camelCase: text, timing, llm, language, profiles, glossary, rules, llmLinebreaks, and the rest of the upstream configuration guide. **overtone init** writes a file that pins today's rule set and default models. Command-line flags override the file.

API keys belong in a **.env** file next to that config, or in the environment. **overtone providers** prints the variable names. Do not put secrets in overtone.config.json.

**--local** expects the whisper-cli binary on PATH, a ggml model in the whisper.cpp cache, and an Ollama server (default http://localhost:11434) with qwen3:8b pulled. English runs download the CMU Pronouncing Dictionary once unless a local copy is already configured.

# CAVEATS

**transcribe** and **burn** need **ffmpeg** and **ffprobe** on PATH. **burn** needs ffmpeg 5 or later and Google Chrome or Chromium. **recut** needs neither.

The cloud default stops before any request if the OpenAI key or the Azure Speech key and region are missing. An ElevenLabs key adds that engine as a second hearing without an extra flag.

Media longer than 2 hours is refused. There is no translation, no sound-effect tags, and no graphical editor. Full line-cutting rules exist for English and Dutch. German, French, Spanish, Italian and Portuguese have language detection. Other languages get neutral rules. In scripts without spaces, one timed unit is a whole phrase.

**--local** labels every word as speaker S1 unless the whisper.cpp model is a speaker-turn model. Word times from whisper.cpp are coarser around pauses than Azure Speech. The same words and rule set always cut the same lines. The words themselves can still change between cloud runs.

This page is the captions CLI from the overtone-captions package. The command name is a common English word, so other projects may use it too.

# SEE ALSO

[ffmpeg](/man/ffmpeg)(1), [ffprobe](/man/ffprobe)(1), [whisper](/man/whisper)(1), [faster-whisper](/man/faster-whisper)(1), [ollama](/man/ollama)(1)

# RESOURCES

```[Source code](https://github.com/lonthq/overtone-captions)```

```[Homepage](https://overtone.lont.ai/)```

```[Documentation](https://github.com/lonthq/overtone-captions/blob/main/docs/cli/reference.md)```

<!-- verified: 2026-10-29 -->

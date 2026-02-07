# TAGLINE

open-source speech-to-text engine

# TLDR

**Transcribe an audio file**

```deepspeech --model [model.pbmm] --audio [audio.wav]```

**Transcribe with scorer** (language model)

```deepspeech --model [model.pbmm] --scorer [scorer.scorer] --audio [audio.wav]```

**Transcribe with extended output**

```deepspeech --model [model.pbmm] --audio [audio.wav] --extended```

**Transcribe using TFLite model**

```deepspeech --model [model.tflite] --audio [audio.wav]```

**Stream audio from microphone** (with Python)

```python -c "import deepspeech; ..."```

# SYNOPSIS

**deepspeech** **--model** _model_ **--audio** _audio_ [_options_]

# PARAMETERS

**--model** _file_
> Path to the model file (.pbmm or .tflite).

**--scorer** _file_
> Path to external scorer/language model.

**--audio** _file_
> Audio file to transcribe (16kHz, 16-bit, mono WAV).

**--extended**
> Output word timing and confidence.

**--json**
> Output results as JSON.

**--candidate_transcripts** _n_
> Number of alternative transcriptions.

**--hot_words** _words_
> Boost probability of specific words.

**--version**
> Display version information.

# DESCRIPTION

**DeepSpeech** is an open-source speech-to-text engine based on deep learning. It uses an end-to-end neural network architecture to convert audio into text transcriptions.

The system requires a trained model and optionally an external scorer (language model) for improved accuracy. Pre-trained English models are available, and the toolkit supports training custom models for other languages or domains.

Audio input must be 16kHz, 16-bit, mono WAV format. The tool supports both batch transcription of files and real-time streaming transcription through its API.

# PYTHON API

```python
import deepspeech
import wave

model = deepspeech.Model('model.pbmm')
model.enableExternalScorer('scorer.scorer')

with wave.open('audio.wav', 'rb') as w:
    audio = w.readframes(w.getnframes())

text = model.stt(audio)
print(text)
```

# CAVEATS

Accuracy depends on audio quality and acoustic similarity to training data. Models are large (hundreds of MB). GPU acceleration requires specific TensorFlow builds. Project development has slowed; consider alternatives like Whisper for new projects.

# HISTORY

DeepSpeech was developed by **Mozilla** starting in **2017** as part of their Common Voice project to create open-source voice technology. Based on research by Baidu, it used recurrent neural networks for speech recognition. Mozilla discontinued active development in **2021** after layoffs, but the project was forked and continued by the community as **Coqui STT**.

# SEE ALSO

[whisper](/man/whisper)(1), [vosk](/man/vosk)(1), [pocketsphinx](/man/pocketsphinx)(1)

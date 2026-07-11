# TAGLINE

Audio ML pipeline to diagnose car faults from sound recordings

# TLDR

**Check prerequisites** and environment

```cardiag doctor```

**Train a model** using bundled fixtures (no external data)

```cardiag train --fixtures```

**Diagnose a clip** and get fault verdict, zone, and ranked parts

```cardiag diagnose clip.wav```

**Run the web UI** for interactive analysis

```cardiag serve --model models```

**Isolate mechanical sound** from a noisy recording (no model)

```cardiag clean clip.wav```

**Triage engine vs running gear**

```cardiag triage clip.wav```

# SYNOPSIS

**cardiag** {doctor,train,diagnose,triage,clean,inspect,ingest,scrape,serve,...} [options] [args]

# DESCRIPTION

**cardiag** is an end-to-end audio machine-learning pipeline for triaging mechanical faults from audio recordings (e.g. phone clips or scraped social media). It isolates the relevant mechanical sound span, embeds it with a frozen CLAP model, and applies small calibrated linear classifiers.

The tool reports:

- Whether something sounds wrong (fault vs normal)
- Rough location in the car (6 zones)
- Ranked shortlist of likely parts (12+ families)
- Honest `UNCERTAIN` when the input does not support a confident call

It is explicitly a **triage aid**, not a safety-critical or definitive diagnostic. All numbers are honest (grouped-by-video cross-validation) and the pipeline is designed to be inspectable.

# INSTALLATION

Install from the repository:

```bash
git clone https://github.com/adam-s/car-diagnosis
cd car-diagnosis
uv venv && source .venv/bin/activate
uv pip install -e ".[scrape,web,dev,viz]"
```

Requires Python 3.11+ and (for full use) additional optional extras. Playback/visualization is optional.

# USAGE

Run `cardiag --help` or `cardiag <subcommand> --help` for details.

Common workflow for a new clip:

1. `cardiag doctor`
2. `cardiag diagnose my-recording.wav --json`
3. `cardiag inspect my-recording.wav -o report.html` (visual + audio spans)

Training your own data:

- `cardiag ingest ./my_clips --kind fault --cause wheel_bearing`
- `cardiag scrape youtube|tiktok ...`
- `cardiag train`

The `serve` subcommand starts a local web UI for drag-and-drop or URL-based analysis. Add `--json` to inference commands for machine-readable output.

# CAVEATS

- Performance is modest on crude phone/social audio (literature ceiling for the problem). It reaches ~0.79 AUROC fault/normal and top-3 part accuracy 45-65 % in honest evaluation.
- Models are joblib artifacts; only load ones you trust.
- Not a replacement for professional diagnosis.

# RESOURCES

```[Source code](https://github.com/adam-s/car-diagnosis)```

```[Documentation](https://github.com/adam-s/car-diagnosis/blob/main/docs/MODEL_CARD.md)```

<!-- verified: 2026-07-11 -->

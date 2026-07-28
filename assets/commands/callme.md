# TAGLINE

Ring or text your iPhone from AI agents and scripts

# TLDR

**Pair** once with the number from the Call Me app

```callme pair [5551234567]```

**Call** and wait for a spoken answer (transcribed)

```callme call "[Deploy staging or prod first?]"```

Send a **text** / push notification

```callme text "[Build green, PR merged.]"```

Print **setup** instructions

```callme setup```

Show a **QR** for the App Store link

```callme qr```

Read the paired **number**

```callme number```

# SYNOPSIS

**callme** {_pair_|_call_|_text_|_listen_|_events_|_setup_|_qr_|_number_|...} [_args_]

# PARAMETERS

**pair** _number_
> Store the 10-digit Call Me number from the iOS app in `~/.aiphone/config.json`

**call** _message_
> Place a CallKit call; TTS speaks the question; blocks until voice reply is transcribed

**text** _message_
> Send a push-notification style message to the phone

**listen** / **events**
> Fetch replies for non-plugin agent sessions

**setup**
> Print pairing and usage steps

**qr**
> Print a scannable QR code for the app download link

**number**
> Print the currently paired number

# DESCRIPTION

**callme** is a small bash+curl CLI that connects terminal agents and scripts to the **Call Me** iOS app (formerly AI Phone). After pairing, agents can ring your real iPhone, speak a question via TTS, and receive your spoken answer as text, or send asynchronous texts.

Credentials live in `~/.aiphone/config.json` (mode 0600), not in agent instruction files. A Claude Code plugin variant installs the same flow into interactive sessions.

# CAVEATS

Requires the Call Me iOS app and network access to the Call Me service. Calls block until answered—unsuitable for unattended automation without timeouts. Phone numbers are credentials; do not commit config files.

# HISTORY

Agent integration for the **Call Me** iPhone app by radres; standalone skill under `skill/callme` in the open-source repo.

# SEE ALSO

[curl](/man/curl)(1), [jq](/man/jq)(1)

# RESOURCES

```[Source code](https://github.com/radres/call-me)```

```[Homepage](https://apps.apple.com/app/id6789575165)```

<!-- verified: 2026-07-28 -->

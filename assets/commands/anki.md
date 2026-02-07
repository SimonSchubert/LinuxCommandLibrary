# TAGLINE

Spaced repetition flashcard program

# TLDR

**Start** Anki

```anki```

Open with **specific profile**

```anki -p "[Profile Name]"```

Import a **deck**

```anki [deck.apkg]```

Open in **base directory**

```anki -b [~/.anki2]```

# SYNOPSIS

**anki** [_-p profile_] [_-b basedir_] [_file_]

# DESCRIPTION

**anki** is a spaced repetition flashcard program that helps memorize information efficiently. It uses an intelligent scheduling algorithm to show cards at optimal intervals, maximizing retention while minimizing study time.

The application supports text, images, audio, and video on cards, with extensive customization through card templates and add-ons. It syncs across devices through AnkiWeb.

# PARAMETERS

**-p** _profile_
> Load specific user profile

**-b** _directory_
> Use alternate base directory

**-l** _lang_
> Interface language code

**--syncserver** _url_
> Custom sync server URL

# CAVEATS

First startup may be slow while building database. Deck imports can be large. Sync requires AnkiWeb account. Some add-ons may not be compatible with latest versions.

# HISTORY

**Anki** was created by Damien Elmes and first released in **2006**. It's based on the SM2 spaced repetition algorithm developed by Piotr Wozniak. The name comes from the Japanese word for "memorization."

# SEE ALSO

[mnemosyne](/man/mnemosyne)(1), [org-drill](/man/org-drill)(1)

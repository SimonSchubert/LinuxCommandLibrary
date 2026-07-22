package com.linuxcommandlibrary.shared

import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf
import kotlinx.collections.immutable.toImmutableList

/**
 * One package-manager install line from a command man page's INSTALL section.
 *
 * Markdown source shape (inline code fence):
 * ```apt: sudo apt install 7zip```
 */
data class InstallEntry(
    /** Package manager id: apt, dnf, pacman, aur, apk, zypper, brew, nix. */
    val manager: String,
    /** Install command without the `manager:` prefix. */
    val command: String,
    /** Resolved package name when extractable. */
    val packageName: String?,
    /** Official web package-index URL for [packageName], or null. */
    val packageUrl: String?,
)

/**
 * Parse INSTALL section code fences and build package-index URLs.
 * Shared by command detail (Compose/Swift) and the static website builder.
 */
object InstallEntries {

    val KNOWN_MANAGERS: Set<String> = setOf(
        "apt",
        "dnf",
        "pacman",
        "aur",
        "apk",
        "zypper",
        "brew",
        "nix",
    )

    private val LINE_REGEX = Regex("""^(\w+):\s*(.+)$""")

    /**
     * Extract install rows from already-parsed markdown elements (INSTALL section body).
     */
    fun parseFromElements(elements: ImmutableList<TipSectionElement>): ImmutableList<InstallEntry> {
        if (elements.isEmpty()) return persistentListOf()
        return elements
            .filterIsInstance<TipSectionElement.Code>()
            .mapNotNull { parseCodeLine(it.command) }
            .toImmutableList()
    }

    /**
     * Parse a single fence body such as `apt: sudo apt install 7zip`.
     */
    fun parseCodeLine(raw: String): InstallEntry? {
        val match = LINE_REGEX.matchEntire(raw.trim()) ?: return null
        val manager = match.groupValues[1].lowercase()
        if (manager !in KNOWN_MANAGERS) return null
        val command = match.groupValues[2].trim()
        if (command.isEmpty()) return null
        val packageName = extractPackageName(manager, command)
        return InstallEntry(
            manager = manager,
            command = command,
            packageName = packageName,
            packageUrl = packageName?.let { packageUrl(manager, it) },
        )
    }

    /**
     * Last whitespace token is the package for all current INSTALL templates.
     * For nix (`nixpkgs#pkg` / `nixpkgs.python3Packages.foo`) take the attribute after `#`
     * when present; otherwise keep the last token as-is.
     */
    fun extractPackageName(manager: String, command: String): String? {
        val last = command.trim().split(Regex("\\s+")).lastOrNull()?.takeIf { it.isNotEmpty() }
            ?: return null
        return when {
            manager == "nix" && '#' in last -> last.substringAfterLast('#').ifEmpty { null }
            else -> last
        }
    }

    fun packageUrl(manager: String, packageName: String): String? {
        val encoded = encodeQuery(packageName)
        return when (manager) {
            "apt" -> "https://packages.debian.org/search?keywords=$encoded"
            "dnf" -> "https://packages.fedoraproject.org/search?query=$encoded"
            "pacman" -> "https://archlinux.org/packages/?q=$encoded"
            "aur" -> "https://aur.archlinux.org/packages/${encodePath(packageName)}"
            "apk" -> "https://pkgs.alpinelinux.org/packages?name=$encoded"
            "zypper" -> "https://software.opensuse.org/package/${encodePath(packageName)}"
            "brew" -> "https://formulae.brew.sh/formula/${encodePath(packageName)}"
            "nix" -> "https://search.nixos.org/packages?query=$encoded"
            else -> null
        }
    }

    /** Encode for query values; package names are almost always unreserved. */
    private fun encodeQuery(value: String): String = buildString(value.length) {
        for (c in value) {
            when {
                c.isLetterOrDigit() || c in "-._~" -> append(c)
                c == ' ' -> append('+')
                else -> append(percentEncode(c))
            }
        }
    }

    /** Encode a single path segment (no slashes expected in package names). */
    private fun encodePath(value: String): String = buildString(value.length) {
        for (c in value) {
            when {
                c.isLetterOrDigit() || c in "-._~" -> append(c)
                else -> append(percentEncode(c))
            }
        }
    }

    private fun percentEncode(c: Char): String {
        val bytes = c.toString().encodeToByteArray()
        return bytes.joinToString("") { b ->
            "%" + b.toUByte().toString(16).uppercase().padStart(2, '0')
        }
    }
}

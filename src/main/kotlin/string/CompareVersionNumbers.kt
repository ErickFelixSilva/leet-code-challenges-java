package string

import kotlin.math.max

class CompareVersionNumbers {
    fun compareVersion(version1: String, version2: String): Int {
        val revisionsVersion1 = version1.split('.')
        val revisionsVersion2 = version2.split('.')
        for (i in 0..max(revisionsVersion1.size, revisionsVersion2.size)) {
            val revisionVersion1 = if (i < revisionsVersion1.size) revisionsVersion1[i].toInt() else 0
            val revisionVersion2 = if (i < revisionsVersion2.size) revisionsVersion2[i].toInt() else 0
            if (revisionVersion1 < revisionVersion2) return -1
            else if (revisionVersion1 > revisionVersion2) return 1
        }
        return 0
    }
}
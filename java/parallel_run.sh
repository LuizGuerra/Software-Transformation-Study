#   ========================================================================================================
#   This file resets the Edited folder files for their original states, written in the Original folder files
#   ========================================================================================================

# Source folder
ScriptDirectory="$( cd -- "$( dirname -- "${BASH_SOURCE[0]:-$0}"; )" &> /dev/null && pwd 2> /dev/null; )";
# Path fork
Original="original"
Edited="edited"
# Declare an array of string of file semi relative paths
declare -a StringArray=("01_individual/EntrySet.java" "01_individual/RepeatedStrings.java" "02_joint/FileWithTwoCodeSmells.java" "03_integrated/IntegratedCodeSmells.java")

# Iterate the string array using for loop
for val in ${StringArray[@]}; do
    FilePath="$ScriptDirectory/$Edited/$val"
    if test -f $FilePath;
    then
        java -jar spongebugs-runner-2.0.0.jar $FilePath & # running all files in in parallel
    else
        echo "Oops... $FilePath"
    fi
done

wait
echo "All threads done"

package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResource=IMAGE;
    private int mVoice;

    // for check if image is found or not
    private static final int IMAGE = -1;
    // costructor with image
    public Word(String defaultTranslation, String miwokTranslation,int image,int voice) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResource=image;
        mVoice=voice;
    }
    // other constructor without image for phrasesActivity
    public Word(String defaultTranslation, String miwokTranslation,int voice) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mVoice=voice;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
    public int getImage(){
        return mImageResource;
    }
    // method for check the image is found or not
    public boolean hasimage(){ return mImageResource != IMAGE; }
    public int getvoice(){ return mVoice; }
}

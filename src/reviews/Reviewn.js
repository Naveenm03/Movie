import React, { useEffect } from 'react'
import {useParams} from 'react-router-dom';
import {Container, Row, Col} from 'react-bootstrap';
import api from '../api/axiosConfig';
import { useState } from 'react';
import ReviewForm from '../reviewForm/ReviewForm';
import Reviews from './Reviews';


const ReviewPage = () => {
    const [revid , setRevid ] = useState(0);
  const [name , setName ] = useState('');
  const [email , setEmail ] = useState('');
  const [rating , setRating ] = useState('');
  const [comment , setComment ] = useState('');
  const [reviews , setReviews ] = useState('');
  const [sent , setSent] = useState(false);
  var review = {name: name,
    email: email,
    rating: rating,
    // comment: comment,
    reviews: reviews,
    revid:revid,
};

  useEffect(() => {

  }, [review])

  useEffect(() => {
    setReviews(comment);
  },[comment])
//   useEffect(() => {
//     setRevid(revid);
//   },[revid])

//   const handleInputChange = (event) => {
//     setReview({ ...review, [event.target.name]: event.target.value });
//   };


const handleName = (e) => {
    setName(e.currentTarget.value);
}
const handleEmail = (e) => {
    setEmail(e.currentTarget.value);
}
const handleRating = (e) => {
    setRating(e.currentTarget.value);
}
const handleComment = (e) => {
    setComment(e.currentTarget.value);
}

  const handleSubmit = async (event) => {
      event.preventDefault();
      review= {
          name: name,
          email: email,
          rating: rating,
          // comment: comment,
          reviews: reviews,
       
        };
        setSent(true);
    try {
      const response = await api.post('/addreview', review);
      console.log(response.data);
      
    } catch (error) {
      console.error(error);
      // show error message to user
    }
  };

  const handleSub = async (event) => {
    event.preventDefault();
    review= {
        name: name,
        email: email,
        rating: rating,
        // comment: comment,
        reviews: reviews,
        revid:revid,
      };
      setSent(true);
  try {
    const response = await api.delete(`/deleterev/${revid}`, review);
    console.log(response.data);
    
  } catch (error) {
    console.error(error);
    // show error message to user
  }
};

  return (
    <div className='main' style={{backgroundColor:"black"}}>
      <h1 style={{color:"white"}}>Leave a review</h1>
      <form onSubmit={handleSubmit} >
      <div className='text' style={{padding:"30px"}}>
        <label >
          <h4 style={{color:"white"}}>Name:</h4>
          <input type="text" name="name" value={name} onChange={handleName} />
        </label>
        </div>
        <div className='email' style={{padding:"30px"}}>
        <label >
         <h4 style={{color:"white"}}>Email:</h4> 
          <input type="email" name="email" value={email} onChange={handleEmail} />
        </label>
        </div>
        <div className='rating' style={{padding:"30px"}}>
        <label>
          <h4 style={{color:"white"}}>Rating:</h4>
          <select name="rating" value={rating} onChange={handleRating}>
            <option value="5">5 stars</option>
            <option value="4">4 stars</option>
            <option value="3">3 stars</option>
            <option value="2">2 stars</option>
            <option value="1">1 star</option>
          </select>
        </label>
        </div>
        <div className='comment' style={{padding:"30px"}}>
        <label>
         <h4 style={{color:"white"}}>Comment:</h4> 
          <textarea name="comment" value={comment} onChange={handleComment}></textarea>
        </label>
        </div>
        <div className='submit' style={{padding:"30px"}}>
        <button type="submit" >Submit review</button>
        </div>
      </form>
      <form onSubmit={handleSub}>
      <div className='delete' style={{padding:"30px"}}>
        <button type="submit"  >delete</button>
        </div>
        </form>

      <div className='rev' style={{color:"white"}}>
        {sent && <p>{review.reviews}</p>}</div>
       
    </div>
    
  );
};


export default ReviewPage;
